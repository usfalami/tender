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
	
	
	public static enum LENGTH implements Mesure {
		MM, CM, DM, M, DAM, HM, KM;
	}
	public static enum AREA implements Mesure {
		MM2, CM2, DM2, M2, DAM2, HM2, KM2;
	}
	public static enum VOLUME implements Mesure {
		MM3, CM3, DM3, M3, DAM3, HM3, KM3;
	}
	public static enum WEIGHT implements Mesure {
		MG, CG, DG, G, DAG, HG, KG, KGx10, Q, T;
	}
	public static enum CAPACITY implements Mesure  {
		ML, CL, DL, L, DAL, HL;
	}
	public static enum DATA implements Mesure {
		B, O, KO, MO, GO, TO, Kio, Mio, Gio, Tio;
	}
	public static enum ENERGY implements Mesure {
		W, KW; //.....
	}
	public static enum TIME implements Mesure {
		MS, S, M, H, D, W, Mo, Y, De; 
	}
	
	
	public static interface Mesure {}
	
}
