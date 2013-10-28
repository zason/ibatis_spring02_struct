package firstSteps;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.data.Form;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class PersonResoure extends ServerResource {
	@Post
	public String uploadMovie(JsonRepresentation personJson)
			throws JSONException {
		JSONObject movie = personJson.getJsonObject();
		System.out.println(movie.get("name"));
		String ret = "false";
		return ret;
	}
	
	@Get
	public String represent() {
		return "hello, world";
	}
}
