package com.tender.bean;

import java.util.Date;

public abstract class Action {
	
	protected Long id;
	
	protected String reference;
	protected Date startDate;
	protected Date endDate;
	
	protected Actor author;
	protected Job[] jobs;

}
