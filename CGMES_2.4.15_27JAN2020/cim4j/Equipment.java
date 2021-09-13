package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.PowerSystemResource;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.EquipmentContainer;
import cim4j.OperationalLimitSet;

/*
The parts of a power system that are physical devices, electronic or mechanical.
*/
public class Equipment extends PowerSystemResource
{
	private BaseClass[] Equipment_class_attributes;
	private BaseClass[] Equipment_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum Equipment_primitive_builder implements PrimitiveBuilder {
		aggregate(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum Equipment_class_attributes_enum {
		aggregate,
		EquipmentContainer,
		OperationalLimitSet,
			LAST_ENUM;
	}

		
		
		
	
	public Equipment() {
		Equipment_primitive_attributes = new BaseClass[Equipment_primitive_builder.values().length];
		Equipment_class_attributes = new BaseClass[Equipment_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(Equipment_class_attributes_enum attrEnum, BaseClass value) {
		try {
			Equipment_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(Equipment_primitive_builder attrEnum, BaseClass value) {
		try {
			Equipment_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			Equipment_class_attributes_enum attrEnum = Equipment_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated Equipment, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			Equipment_primitive_builder attrEnum = Equipment_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated Equipment, setting " + attrName  + " to: "  + value);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString(boolean topClass) {
		java.lang.String result = "";
		java.lang.String indent = "";
		if (topClass) {
			for (Equipment_primitive_builder attrEnum: Equipment_primitive_builder.values()) {
				BaseClass bc = Equipment_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Equipment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (Equipment_class_attributes_enum attrEnum: Equipment_class_attributes_enum.values()) {
				BaseClass bc = Equipment_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    Equipment." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(Equipment) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "Equipment";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new Equipment();
        }
};
