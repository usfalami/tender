package com.tender.bean.unit;

public interface Mesure {

	public static enum LENGTH implements Mesure {
		MM("millimetre"), CM(""), DM(""), M(""), DAM(""), HM(""), KM("kilometre");
		
		private String fullName;
		
		LENGTH(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum AREA implements Mesure {
		MM2(""), CM2(""), DM2(""), M2(""), DAM2(""), HM2(""), KM2("");
		
		private String fullName;
		
		AREA(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum VOLUME implements Mesure {
		MM3(""), CM3(""), DM3(""), M3(""), DAM3(""), HM3(""), KM3("");
		
		private String fullName;
		
		VOLUME(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum WEIGHT implements Mesure {
		MG("milligram"), CG(""), DG(""), G(""), DAG(""), HG(""), KG("kilogram"), KGx10(""), Q(""), T("");
		
		private String fullName;
		
		WEIGHT(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum CAPACITY implements Mesure  {
		ML(""), CL(""), DL(""), L(""), DAL(""), HL("");
		
		private String fullName;
		
		CAPACITY(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum DATA implements Mesure {
		B(""), O(""), KO(""), MO(""), GO(""), TO(""), Kio(""), Mio(""), Gio(""), Tio("");
		
		private String fullName;
		
		DATA(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum ENERGY implements Mesure {
		W(""), KW(""); //.....
		
		private String fullName;
		
		ENERGY(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum TIME implements Mesure {
		
		MS(""), S(""), M(""), H(""), D(""), W(""), Mo(""), Y(""), De(""), C("");
		
		private String fullName;
		
		TIME(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	
}
