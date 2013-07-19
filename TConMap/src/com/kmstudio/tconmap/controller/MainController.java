package com.kmstudio.tconmap.controller;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.common.collect.ImmutableMap;
import com.googlecode.htmleasy.ViewWith;

@Path("/map")
public class MainController {
	@GET @Path("/")
    @ViewWith("/soy/main.Map")
    public Map<String, ?> listBoats() {
		// FUTURE: Paginate with nice URLs.
		return ImmutableMap.of();
    }
}
