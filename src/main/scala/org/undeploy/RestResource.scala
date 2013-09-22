package org.undeploy

import javax.ws.rs.{GET, Path, Produces}
import javax.ws.rs.core.{MediaType, UriInfo, Context, Response}
import com.fasterxml.jackson.annotation.{JsonCreator, JsonProperty}
import java.util.Date

@Path("/application")
class RestResource {

  case class Greeting (name:String, msg:String, date:Date)

  @GET
  @Path("/test")
  @Produces(Array(MediaType.APPLICATION_JSON))
  def index(@Context uriInfo: UriInfo)  = Greeting("Some Name","Hello World", new Date)
}