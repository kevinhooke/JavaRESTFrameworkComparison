package simpleclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.filter.LoggingFilter;

public class ClientApp {

	public ClientApp(){
		
	}
	
	public static void main(String[] args) {
		ClientApp app = new ClientApp();
		app.callResource();
	}

	public void callResource(){
		Client client = ClientBuilder.newBuilder()
				.register(new LoggingFilter()) //add this for Jersey request/response logging
				//.register(JacksonFeature.class) //use Jackson JSON mapping
				.build();
		WebTarget target = client.target("http://localhost:8080")
				.path("simple");
		
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
			.get();
		
		if(response.getStatus() == Response.Status.OK.getStatusCode()){
			System.out.println("Success! (status: 200)");
		}
		else{
			System.out.println("Unexpected HTTP status: " + Response.Status.OK.getStatusCode());			
		}
		
		
	}
	
}
