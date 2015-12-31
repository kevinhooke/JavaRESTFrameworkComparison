package kh.simplespringbootjersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyExampleConfig extends ResourceConfig {

	public JerseyExampleConfig() {
		register(SimpleResource.class);
	}

}
