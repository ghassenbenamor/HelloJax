package rest.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path ("/greetings")
public class HelloResource {
	
	
	    public HelloResource() {
		super();
		
	}

		@GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String sayHello()
	    {
	    	return "Hello from JAX-RS" ;
	    }
	    
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String sayHelloTo2(@QueryParam(value="FirstName")String prenom,@QueryParam(value="LastName")String nom)
	    {
	    	return "Hello from JAX-RS"+prenom+" "+nom;
	    }
	    
	    @GET
	    @Path("{FirstName}/{LastName}")
	    @Produces(MediaType.TEXT_PLAIN)
	    public String sayHelloTo1(@PathParam(value="FirstName")String prenom,@PathParam(value="LastName")String nom)
	    {
	    	return "Hello from JAX-RS"+prenom+" "+nom;
	    }
	    
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	   public String sayHello(@QueryParam(value="FirstName")String prenom,@QueryParam(value="LastName")String nom)
	   {
	    	if(prenom==null && nom==null)
	    	{
	    		return "Hello from JAX-RS";
	    	}
	    	return "Hello from JAX-RS "+prenom+" "+nom;
	    	}
	    
	    
	    
}
