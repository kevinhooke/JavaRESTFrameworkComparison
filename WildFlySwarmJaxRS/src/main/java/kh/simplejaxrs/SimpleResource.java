package kh.simplejaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import kh.simplejaxrs.domain.SimpleResult;

@Path("/simple")
public class SimpleResource {

	@GET
	@Produces("application/json")
	public SimpleResult example(){
		
		SimpleResult result = new SimpleResult();
		return result;
	}
	
}
