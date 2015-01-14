package com.shafz.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/v1/status")
public class ShafzStatus {
	
	private static final String version="1.0.0";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Restful Webservices</p>";
	}
	
	@Path("version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>Java Restful Webservices version:</p>"+ version;
	}

}
