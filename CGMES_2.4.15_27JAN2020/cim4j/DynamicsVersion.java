package cim4j;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;




import cim4j.Date;

/*
Version details.
*/
public class DynamicsVersion extends BaseClass
{
	private BaseClass[] DynamicsVersion_class_attributes;
	private BaseClass[] DynamicsVersion_primitive_attributes;
	private java.lang.String rdfid;

	public void setRdfid(java.lang.String id) {
		rdfid = id;
	}

	private abstract interface PrimitiveBuilder {
		public abstract BaseClass construct(java.lang.String value);
	};

	private enum DynamicsVersion_primitive_builder implements PrimitiveBuilder {
		baseUML(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		baseURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		differenceModelURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		entsoeUML(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		entsoeURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		modelDescriptionURI(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		namespaceRDF(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		namespaceUML(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
		shortName(){
			public BaseClass construct (java.lang.String value) {
				return new String(value);
			}
		},
			LAST_ENUM() {
			public BaseClass construct (java.lang.String value) {
				return new cim4j.Integer("0");
			}
		};
	}

	private enum DynamicsVersion_class_attributes_enum {
		baseUML,
		baseURI,
		date,
		differenceModelURI,
		entsoeUML,
		entsoeURI,
		modelDescriptionURI,
		namespaceRDF,
		namespaceUML,
		shortName,
			LAST_ENUM;
	}

		
		
		
		
		
		
		
		
		
		
	
	public DynamicsVersion() {
		DynamicsVersion_primitive_attributes = new BaseClass[DynamicsVersion_primitive_builder.values().length];
		DynamicsVersion_class_attributes = new BaseClass[DynamicsVersion_class_attributes_enum.values().length];
	}

	public void updateAttributeInArray(DynamicsVersion_class_attributes_enum attrEnum, BaseClass value) {
		try {
			DynamicsVersion_class_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void updateAttributeInArray(DynamicsVersion_primitive_builder attrEnum, BaseClass value) {
		try {
			DynamicsVersion_primitive_attributes[attrEnum.ordinal()] = value;
		}
		catch (ArrayIndexOutOfBoundsException aoobe) {
			System.out.println("No such attribute: " + attrEnum.name() + ": " + aoobe.getMessage());
		}
	}

	public void setAttribute(java.lang.String attrName, BaseClass value) {
		try {
			DynamicsVersion_class_attributes_enum attrEnum = DynamicsVersion_class_attributes_enum.valueOf(attrName);
			updateAttributeInArray(attrEnum, value);
			System.out.println("Updated DynamicsVersion, setting " + attrName);
		}
		catch (IllegalArgumentException iae)
		{
			super.setAttribute(attrName, value);
		}
	}

	/* If the attribute is a String, it is a primitive and we will make it into a BaseClass */
	public void setAttribute(java.lang.String attrName, java.lang.String value) {
		try {
			DynamicsVersion_primitive_builder attrEnum = DynamicsVersion_primitive_builder.valueOf(attrName);
			updateAttributeInArray(attrEnum, attrEnum.construct(value));
			System.out.println("Updated DynamicsVersion, setting " + attrName  + " to: "  + value);
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
			for (DynamicsVersion_primitive_builder attrEnum: DynamicsVersion_primitive_builder.values()) {
				BaseClass bc = DynamicsVersion_primitive_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DynamicsVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			for (DynamicsVersion_class_attributes_enum attrEnum: DynamicsVersion_class_attributes_enum.values()) {
				BaseClass bc = DynamicsVersion_class_attributes[attrEnum.ordinal()];
				if (bc != null) {
					result += "    DynamicsVersion." + attrEnum.name() + "(" + bc.debugString() + ")" + " " + bc.toString(false) + System.lineSeparator();
				}
			}
			result += super.toString(true);
		}
		else {
			result += "(DynamicsVersion) RDFID: " + rdfid;
		}
		return result;
	}

	public final java.lang.String debugName = "DynamicsVersion";

	public java.lang.String debugString()
	{
		return debugName;
	}

	public void setValue(java.lang.String s) {
		System.out.println(debugString() + " is not sure what to do with " + s);
	}

	public BaseClass construct() {
		return new DynamicsVersion();
        }
};
