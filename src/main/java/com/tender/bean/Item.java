package com.tender.bean;

import com.tender.bean.unit.Mesure.CAPACITY;
import com.tender.bean.unit.Mesure.DATA;
import com.tender.bean.unit.Mesure.ENERGY;
import com.tender.bean.unit.Mesure.VOLUME;
import com.tender.bean.unit.Mesure.WEIGHT;
import com.tender.bean.unit.Unit;

public class Item {

	protected String name;
	protected Unit<?> unit; // = new Unit<LENGTH>() // = new Unit<WEIGHT>(); 

	public static void main(String[] args) {
		// unit can be :
		
		Unit<?> a = null;
		System.out.println((a = new Unit<WEIGHT>(WEIGHT.KG)) + " " + a.toReelValue());
		System.out.println((a = new Unit<DATA>(DATA.MO)) + " " + a.toReelValue());
		System.out.println((a = new Unit<VOLUME>(VOLUME.M3)) + " " + a.toReelValue());
		System.out.println((a = new Unit<ENERGY>(ENERGY.W)) + " " + a.toReelValue());
		System.out.println((a = new Unit<CAPACITY>(CAPACITY.ML)) + " " + a.toReelValue());
	}
	
	
}
