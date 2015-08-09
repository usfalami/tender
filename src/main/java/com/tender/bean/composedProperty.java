package com.tender.bean;

import com.tender.bean.unit.Unit;

public class composedProperty<T extends Enum<?>> {

	protected Property property;
	
	protected String value;
	
	protected Unit<T> unit;
	
	public String toString() {
		return "[property="+property.toString()+" value="+value+" "+unit+"]";
	}
	
	public enum Property {
		Length,Size,Quantiy;
	}
}
