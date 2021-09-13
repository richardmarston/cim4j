package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.VoltageAdjusterDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Boolean;


import cim4j.ProprietaryParameterDynamics;

/*
function block whose dynamic behaviour is described by
*/
public class VoltageAdjusterUserDefined extends VoltageAdjusterDynamics
{
	private BaseClass[] VoltageAdjusterUserDefined_class_attributes;
	private BaseClass[] VoltageAdjusterUserDefined_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum VoltageAdjusterUserDefined_primitive_builder implements PrimitiveBuilder {
		proprietary(){
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

	private enum VoltageAdjusterUserDefined_class_attributes_enum {
		proprietary,
		ProprietaryParameterDynamics,
			LAST_ENUM;
	}

		
		
	
	public VoltageAdjusterUserDefined() {
		VoltageAdjusterUserDefined_primitive_attributes = new BaseClass[VoltageAdjusterUserDefined_primitive_builder.values().length];
		VoltageAdjusterUserDefined_class_attributes = new BaseClass[VoltageAdjusterUserDefined_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(VoltageAdjusterUserDefined_class_attributes_enum attrEnum, BaseClass value) {
		try {
			VoltageAdjusterUserDefined_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(VoltageAdjusterUserDefined_primitive_builder attrEnum, BaseClass value) {
		try {
			VoltageAdjusterUserDefined_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			VoltageAdjusterUserDefined_class_attributes_enum attrEnum = VoltageAdjusterUserDefined_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated VoltageAdjusterUserDefined, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			VoltageAdjusterUserDefined_primitive_builder attrEnum = VoltageAdjusterUserDefined_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated VoltageAdjusterUserDefined, setting " + attrName  + " to: "  + value);
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
			for (VoltageAdjusterUserDefined_primitive_builder attrEnum: VoltageAdjusterUserDefined_primitive_builder.values()) {
				BaseClass bc = VoltageAdjusterUserDefined_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageAdjusterUserDefined." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (VoltageAdjusterUserDefined_class_attributes_enum attrEnum: VoltageAdjusterUserDefined_class_attributes_enum.values()) {
				BaseClass bc = VoltageAdjusterUserDefined_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    VoltageAdjusterUserDefined." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(VoltageAdjusterUserDefined) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "VoltageAdjusterUserDefined";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new VoltageAdjusterUserDefined();
        }
};
