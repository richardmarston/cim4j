package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.ExcitationSystemDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.PU;
import cim4j.Seconds;



/*
Manual excitation control with field circuit resistance. This model can be used as a very simple representation of manual voltage control.
*/
public class ExcAVR5 extends ExcitationSystemDynamics
{
	private BaseClass[] ExcAVR5_class_attributes;
	private BaseClass[] ExcAVR5_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum ExcAVR5_primitive_builder implements PrimitiveBuilder {
		ka(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		rex(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum ExcAVR5_class_attributes_enum {
		ka,
		ta,
		rex,
			LAST_ENUM;
	}

		
		
		
	
	public ExcAVR5() {
		ExcAVR5_primitive_attributes = new BaseClass[ExcAVR5_primitive_builder.values().length];
		ExcAVR5_class_attributes = new BaseClass[ExcAVR5_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(ExcAVR5_class_attributes_enum attrEnum, BaseClass value) {
		try {
			ExcAVR5_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(ExcAVR5_primitive_builder attrEnum, BaseClass value) {
		try {
			ExcAVR5_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			ExcAVR5_class_attributes_enum attrEnum = ExcAVR5_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated ExcAVR5, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			ExcAVR5_primitive_builder attrEnum = ExcAVR5_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated ExcAVR5, setting " + attrName  + " to: "  + value);
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
			for (ExcAVR5_primitive_builder attrEnum: ExcAVR5_primitive_builder.values()) {
				BaseClass bc = ExcAVR5_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR5." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (ExcAVR5_class_attributes_enum attrEnum: ExcAVR5_class_attributes_enum.values()) {
				BaseClass bc = ExcAVR5_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    ExcAVR5." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(ExcAVR5) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "ExcAVR5";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new ExcAVR5();
        }
};
