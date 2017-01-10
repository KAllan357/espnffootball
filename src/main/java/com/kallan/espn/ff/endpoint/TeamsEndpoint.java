package com.kallan.espn.ff.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/teams")
public class TeamsEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return "hello!";
    }
}
