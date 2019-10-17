package com.ibm.starter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.PathParam;
import java.io.StringReader;
import java.lang.StringBuffer;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.*;


@Path("/")
public class StarterResource {

    static Logger logger = Logger.getLogger("StarterAPI");
    static {
        logger.setLevel(Level.ALL);
        logger.addHandler(new ConsoleHandler());
    }

    @GET
    @Path("/v1/StarterGet")
    @Produces(MediaType.APPLICATION_JSON)
    public Response StarterGet() {

        return Response.ok("{'retrieved'}").build();
	}

    @POST
    @Path("/v1/StarterPost")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response StarterPost(String body) {

		return Response.ok("{'created'}").build();         
    }

	@DELETE
    @Path("/v1/StarterDelete")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response StarterDelete(String body) {

		return Response.ok("{'deleted'}").build();         
    }

	@PUT
  @Path("/v1/StarterUpdate")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response StarterUpdate(String body) {

	return Response.ok("{'updated'}").build();         
  }

}
