package firstSteps;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class RacesResource extends ServerResource {
	private String raceID;   
	
    public RacesResource(Context context, Request request, Response response) {
    	super();
    	this.getVariants().add(new Variant(MediaType.TEXT_XML));
    	this.raceID = (String) request.getAttributes().get("race_id");
    }
	
    @Get
    public String represent() {
        return "hello, worlaad"+raceID;
    }
	
}
