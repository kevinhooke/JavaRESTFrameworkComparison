package kh.simplespringbootjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import kh.simplespringbootjersey.domain.SimpleResult;

@Component
@Path("/simple")
public class SimpleResource {

	@GET
	@Produces("application/json")
	public SimpleResult example(){
		
		SimpleResult result = new SimpleResult();
		return result;
	}
	
}
