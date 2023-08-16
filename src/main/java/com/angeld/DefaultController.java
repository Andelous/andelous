package com.angeld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("")
public class DefaultController extends ResourceConfig {
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultController.class);

	@GET
	public String meow() {
		LOGGER.info("About to meow!");
		return "Meowing!";
	}
}
