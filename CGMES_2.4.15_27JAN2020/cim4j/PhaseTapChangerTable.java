package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.IdentifiedObject;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.PhaseTapChangerTablePoint;
import cim4j.PhaseTapChangerTabular;

/*
Describes a tabular curve for how the phase angle difference and impedance varies with the tap step.
*/
public class PhaseTapChangerTable extends IdentifiedObject
{
	private BaseClass[] PhaseTapChangerTable_class_attributes;
	private BaseClass[] PhaseTapChangerTable_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum PhaseTapChangerTable_primitive_builder implements PrimitiveBuilder {
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum PhaseTapChangerTable_class_attributes_enum {
		PhaseTapChangerTablePoint,
		PhaseTapChangerTabular,
			LAST_ENUM;
	}

		
		
	
	public PhaseTapChangerTable() {
		PhaseTapChangerTable_primitive_attributes = new BaseClass[PhaseTapChangerTable_primitive_builder.values().length];
		PhaseTapChangerTable_class_attributes = new BaseClass[PhaseTapChangerTable_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(PhaseTapChangerTable_class_attributes_enum attrEnum, BaseClass value) {
		try {
			PhaseTapChangerTable_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(PhaseTapChangerTable_primitive_builder attrEnum, BaseClass value) {
		try {
			PhaseTapChangerTable_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			PhaseTapChangerTable_class_attributes_enum attrEnum = PhaseTapChangerTable_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated PhaseTapChangerTable, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			PhaseTapChangerTable_primitive_builder attrEnum = PhaseTapChangerTable_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated PhaseTapChangerTable, setting " + attrName  + " to: "  + value);
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
			for (PhaseTapChangerTable_primitive_builder attrEnum: PhaseTapChangerTable_primitive_builder.values()) {
				BaseClass bc = PhaseTapChangerTable_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (PhaseTapChangerTable_class_attributes_enum attrEnum: PhaseTapChangerTable_class_attributes_enum.values()) {
				BaseClass bc = PhaseTapChangerTable_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    PhaseTapChangerTable." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(PhaseTapChangerTable) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "PhaseTapChangerTable";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new PhaseTapChangerTable();
        }
};
