package com.lewismsparlin.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.lewismsparlin.model.SimpleObject;

@Path("simple")
public class SimpleResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response sayHello() {
    SimpleObject object = new SimpleObject("A Name", "A Description");
    return Response.ok()
        .entity(new Gson().toJson(object))
        .build();
  }

}
