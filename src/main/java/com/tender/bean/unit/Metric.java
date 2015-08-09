package com.tender.bean.unit;

public interface Metric {

	public static enum LENGTH implements Metric {
		MM("millimetre"), CM(""), DM(""), M(""), DAM(""), HM(""), KM("kilometre");
		
		private String fullName;
		
		LENGTH(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum AREA implements Metric {
		MM2(""), CM2(""), DM2(""), M2(""), DAM2(""), HM2(""), KM2("");
		
		private String fullName;
		
		AREA(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum VOLUME implements Metric {
		MM3(""), CM3(""), DM3(""), M3(""), DAM3(""), HM3(""), KM3("");
		
		private String fullName;
		
		VOLUME(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum WEIGHT implements Metric {
		MG("milligram"), CG(""), DG(""), G(""), DAG(""), HG(""), KG("kilogram"), KGx10(""), Q(""), T("");
		
		private String fullName;
		
		WEIGHT(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum CAPACITY implements Metric  {
		ML(""), CL(""), DL(""), L(""), DAL(""), HL("");
		
		private String fullName;
		
		CAPACITY(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum DATA implements Metric {
		B(""), O(""), KO(""), MO(""), GO(""), TO(""), Kio(""), Mio(""), Gio(""), Tio("");
		
		private String fullName;
		
		DATA(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum ENERGY implements Metric {
		W(""), KW(""); //.....
		
		private String fullName;
		
		ENERGY(String name){
			fullName= name;
		}
		public String getFullName() {
			return fullName;
		}
	}
	public static enum TIME implements Metric {
		
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
