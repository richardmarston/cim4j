package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.TurbineGovernorDynamics;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


import cim4j.Area;
import cim4j.PU;
import cim4j.Frequency;
import cim4j.Length;
import cim4j.Boolean;
import cim4j.Seconds;
import cim4j.Simple_Float;


import cim4j.VolumeFlowRate;

/*
Detailed hydro unit - Pelton model.  This model can be used to represent the dynamic related to water tunnel and surge chamber. A schematic of the hydraulic system of detailed hydro unit models, like Francis and Pelton, is located under the GovHydroFrancis class.
*/
public class GovHydroPelton extends TurbineGovernorDynamics
{
	private BaseClass[] GovHydroPelton_attributes;

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	// TODO: lambda would read more nicely in this generated code
	private enum GovHydroPelton_primitive_builder implements PrimitiveBuilder {
			av0(){
			public BaseClass construct (java.lang.String value) {
				return new Area(value);
			}
		},
			av1(){
			public BaseClass construct (java.lang.String value) {
				return new Area(value);
			}
		},
			bp(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			db1(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			db2(){
			public BaseClass construct (java.lang.String value) {
				return new Frequency(value);
			}
		},
			h1(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			h2(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			hn(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			kc(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			kg(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			qc0(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			simplifiedPelton(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			staticCompensating(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			ta(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			ts(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tv(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			twnc(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			twng(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			tx(){
			public BaseClass construct (java.lang.String value) {
				return new Seconds(value);
			}
		},
			va(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			valvmax(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			valvmin(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vav(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			vc(){
			public BaseClass construct (java.lang.String value) {
				return new Simple_Float(value);
			}
		},
			vcv(){
			public BaseClass construct (java.lang.String value) {
				return new PU(value);
			}
		},
			waterTunnelSurgeChamberSimulation(){
			public BaseClass construct (java.lang.String value) {
				return new Boolean(value);
			}
		},
			zsfc(){
			public BaseClass construct (java.lang.String value) {
				return new Length(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public GovHydroPelton() {
		GovHydroPelton_attributes = new BaseClass[GovHydroPelton_primitive_builder.values().length];
	}

	public void updateAttributeInArray(GovHydroPelton_primitive_builder attrEnum, BaseClass value) {
		try {
			GovHydroPelton_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

 	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			//GovHydroPelton_ATTR_ENUM attrEnum = GovHydroPelton_ATTR_BC_ENUM.valueOf(attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
 	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			GovHydroPelton_primitive_builder attrEnum = GovHydroPelton_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	public java.lang.String toString() {
		java.lang.String result = "";
		for (GovHydroPelton_primitive_builder attrEnum: GovHydroPelton_primitive_builder.values()) {
			BaseClass bc = GovHydroPelton_attributes[attrEnum.ordinal()];
			if (bc != null) {
				result += attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString() + System.lineSeparator();
			}
		}
		return result;
	}

	public final java.lang.String debugName = "GovHydroPelton";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new GovHydroPelton();
        }
};
