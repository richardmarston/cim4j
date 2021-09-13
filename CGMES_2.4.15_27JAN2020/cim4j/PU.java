package cim4j;

import java.lang.Double;
import java.util.Map;
import java.util.HashMap;
import cim4j.BaseClass;

public class PU extends BaseClass
{
	PU () {}

	PU (double v) {
		value = v;
		initialized = true;
	}

	PU (java.lang.String s) {
		setValue(s);
	}

	public void setValue(java.lang.String s) {
		try
		{
			value = java.lang.Float.valueOf(s.trim()).floatValue();
			initialized = true;
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
        }

	public BaseClass construct() {
		return new PU();
        }

	public double value = 0.0;

	public boolean initialized = false;

	public java.lang.String debugName = "PU";

	public java.lang.String debugString() {
		return debugName;
	}

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("Float class cannot set attribute: " + attributeName);
	}

	public void setAttribute(java.lang.String s, java.lang.String v) {
		try
		{
			value = java.lang.Float.parseFloat(v.trim());
			initialized = true;
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
	}

	public java.lang.String toString(boolean b) {
		return "Float: (" + Double.toString(value) + ")";
	}
};

