package airhacks;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    Greeter greeter;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting get() {
        return new Greeting("Hello noventic " + this.greeter.goodMorning(), 42);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void newGreeting(Greeting greeting) {
        System.out.println("GreetingResource.newGreeting() " + greeting);
    }
}