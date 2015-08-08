package com.tender.bean;

import com.tender.bean.unit.Unit;
import com.tender.bean.unit.Unit.CAPACITY;
import com.tender.bean.unit.Unit.DATA;
import com.tender.bean.unit.Unit.ENERGY;
import com.tender.bean.unit.Unit.VOLUME;
import com.tender.bean.unit.Unit.WEIGHT;

public class Item {

	protected String name;
	protected Unit<?> unit; // = new Unit<LENGTH>() // = new Unit<WEIGHT>(); 

	public static void main(String[] args) {
		// unit can be :
		
		Unit<?> a = null;
		System.out.println(a = new Unit<WEIGHT>(WEIGHT.KG));
		System.out.println(a = new Unit<DATA>(DATA.MO));
		System.out.println(a = new Unit<VOLUME>(VOLUME.M3));
		System.out.println(a = new Unit<ENERGY>(ENERGY.W));
		System.out.println(a = new Unit<CAPACITY>(CAPACITY.ML));
	}
	
	
}
