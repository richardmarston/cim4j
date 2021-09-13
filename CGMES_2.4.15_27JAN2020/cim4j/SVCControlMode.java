package cim4j;

import java.util.Map;
import java.util.HashMap;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

/*
Static VAr Compensator control mode.
*/
public class SVCControlMode extends BaseClass
{
	private enum SVCControlMode_ENUM
	{
			/**
		 * 
		 */
		reactivePower,
			/**
		 * 
		 */
		voltage,
			MAX_SVCControlMode_ENUM;
	}

	private SVCControlMode_ENUM value;

	public BaseClass construct() {
		return new SVCControlMode();
        }

	public SVCControlMode() {}

	public SVCControlMode(java.lang.String s) {
		setValue(s);
        }

	public void setValue(java.lang.String s) {
		try
		{
			value = SVCControlMode_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String a, java.lang.String s) {
		try
		{
			value = SVCControlMode_ENUM.valueOf(s.trim());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println("NumberFormatException: " + iae.getMessage());
		}
        }

	public void setAttribute(java.lang.String attributeName, BaseClass value) {
		throw new IllegalArgumentException("ENUM cannot set attribute: " + attributeName);
	}

	private java.lang.String debugName = "SVCControlMode";

	public java.lang.String debugString(){
		return debugName;
	}

	public java.lang.String toString(boolean b) {
		return "Enum (" + value.toString() + ")";
	}
};

