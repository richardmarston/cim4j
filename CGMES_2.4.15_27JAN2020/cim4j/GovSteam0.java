package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.ActivePower;
import cim4j.PU;
import cim4j.Seconds;



/*
A simplified steam turbine governor model.
*/
public class GovSteam0 extends TurbineGovernorDynamics
{
	private BaseClass[] GovSteam0_class_attributes;
	private BaseClass[] GovSteam0_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovSteam0_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		r(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t1(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		vmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		vmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t2(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		dt(){
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

	private enum GovSteam0_class_attributes_enum {
		mwbase,
		r,
		t1,
		vmax,
		vmin,
		t2,
		t3,
		dt,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
	
	public GovSteam0() {
		GovSteam0_primitive_attributes = new BaseClass[GovSteam0_primitive_builder.values().length];
		GovSteam0_class_attributes = new BaseClass[GovSteam0_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovSteam0_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovSteam0_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovSteam0_primitive_builder attrEnum, BaseClass value) {
		try {
			GovSteam0_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovSteam0_class_attributes_enum attrEnum = GovSteam0_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovSteam0, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovSteam0_primitive_builder attrEnum = GovSteam0_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovSteam0, setting " + attrName  + " to: "  + value);
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
			for (GovSteam0_primitive_builder attrEnum: GovSteam0_primitive_builder.values()) {
				BaseClass bc = GovSteam0_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam0." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovSteam0_class_attributes_enum attrEnum: GovSteam0_class_attributes_enum.values()) {
				BaseClass bc = GovSteam0_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovSteam0." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovSteam0) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovSteam0";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovSteam0();
        }
};
