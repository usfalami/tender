package com.java.bean;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Tender extends Action{
	
	private String title;
	private Date publicationDate;
	private Date responseDeadLine;
	protected Adress executionAdress;
    private List<File> documents;
    private String description;

}
