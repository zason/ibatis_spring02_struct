package firstSteps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class RaceRunnersResource extends ServerResource{
	@Get
	public String represent(String a) {
	        return "hello, world"+a;
	}
}
