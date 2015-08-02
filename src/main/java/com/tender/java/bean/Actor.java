package com.tender.java.bean;

public abstract class Actor {

	protected Long id;
	
	protected String name;
	protected Adress adress;
	protected String phone;
	protected String mobile;
	protected String fax;
	protected Job[] jobs;
	protected String url;  // If the actor is a professional we set it else we not
	protected String siret;  // If the actor is a professional we set it else we not
	
}
