package com.java.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class RestTest {
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_HTML)
	public String getTest(){
		return "<h1>Message from server : </h1> <h4>Rest well setup</h4>";
	}

}
