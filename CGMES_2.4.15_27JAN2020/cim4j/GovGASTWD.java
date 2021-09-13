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
import cim4j.Simple_Float;
import cim4j.Temperature;



/*
Woodward Gas turbine governor model.
*/
public class GovGASTWD extends TurbineGovernorDynamics
{
	private BaseClass[] GovGASTWD_class_attributes;
	private BaseClass[] GovGASTWD_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum GovGASTWD_primitive_builder implements PrimitiveBuilder {
		mwbase(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		kdroop(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ki(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		kd(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		etd(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tcd(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		trate(){
			public BaseClass construct (java.lang.String value) {
				return new ActivePower(value);
			}
		},
		t(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		ecr(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		k3(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		a(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		b(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		c(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
		tf(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		kf(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k5(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		k4(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		t3(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t4(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		tt(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		t5(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
		af1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bf1(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		af2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		bf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		cf2(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tr(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
		k6(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
		tc(){
			public BaseClass construct (java.lang.String value) {
				return new Temperature(value);
			}
		},
		td(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum GovGASTWD_class_attributes_enum {
		mwbase,
		kdroop,
		kp,
		ki,
		kd,
		etd,
		tcd,
		trate,
		t,
		tmax,
		tmin,
		ecr,
		k3,
		a,
		b,
		c,
		tf,
		kf,
		k5,
		k4,
		t3,
		t4,
		tt,
		t5,
		af1,
		bf1,
		af2,
		bf2,
		cf2,
		tr,
		k6,
		tc,
		td,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovGASTWD() {
		GovGASTWD_primitive_attributes = new BaseClass[GovGASTWD_primitive_builder.values().length];
		GovGASTWD_class_attributes = new BaseClass[GovGASTWD_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(GovGASTWD_class_attributes_enum attrEnum, BaseClass value) {
		try {
			GovGASTWD_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(GovGASTWD_primitive_builder attrEnum, BaseClass value) {
		try {
			GovGASTWD_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			GovGASTWD_class_attributes_enum attrEnum = GovGASTWD_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated GovGASTWD, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovGASTWD_primitive_builder attrEnum = GovGASTWD_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated GovGASTWD, setting " + attrName  + " to: "  + value);
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
			for (GovGASTWD_primitive_builder attrEnum: GovGASTWD_primitive_builder.values()) {
				BaseClass bc = GovGASTWD_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGASTWD." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (GovGASTWD_class_attributes_enum attrEnum: GovGASTWD_class_attributes_enum.values()) {
				BaseClass bc = GovGASTWD_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    GovGASTWD." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(GovGASTWD) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "GovGASTWD";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovGASTWD();
        }
};
