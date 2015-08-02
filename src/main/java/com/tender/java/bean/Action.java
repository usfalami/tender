package com.tender.java.bean;

import java.util.Date;

public abstract class Action {
	
	protected Long id;
	
	protected String reference;
	protected Date start;
	protected Date end;
	
	protected Actor author;
	protected Job[] jobs;

}
