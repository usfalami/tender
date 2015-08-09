package com.tender.bean.unit;


public class Unit<T extends Enum<?>> { // force Enum<?> implements Mesure !?

	private T value;
	
	public Unit() {
		
	}	
	public Unit(T value) {
		this.value = value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	
	public long toReelValue() {
		return (long) Math.pow(10, value.ordinal());
	}
	@Override
	public String toString() {
		return "Unit [value=" + value + "]";
	}
	
	
	public static interface Mesure {}
	
}
