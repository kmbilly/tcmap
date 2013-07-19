package com.kmstudio.tconmap.controller;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.common.collect.ImmutableMap;
import com.googlecode.htmleasy.ViewWith;

@Path("/test")
public class HelloWorldController {
	@GET @Path("/")
    @ViewWith("/soy/test.HelloWorld")
    public Map<String, ?> listBoats() {
		// FUTURE: Paginate with nice URLs.
		return ImmutableMap.of("boats", "Abc", "test2", "testing");
    }
}
