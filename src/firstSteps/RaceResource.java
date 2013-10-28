package firstSteps;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Variant;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class RaceResource extends ServerResource {
	/*
	 * private String raceID;
	 * 
	 * public RaceResource(Context context, Request request, Response response)
	 * { this.getVariants().add(new Variant(MediaType.TEXT_XML)); this.raceID =
	 * (String) request.getAttributes().get("race_id"); }
	 */
	private String raceID;
	
	@Override
	public void init(Context context, Request request, Response response) {
	  super.init(context, request, response);
	  Form form = request.getResourceRef().getQueryAsForm();
	  this.raceID = (String) request.getAttributes().get("race_id");
	  //if(form.getFirstValue("age")!=null){
	  //age = Integer.parseInt(form.getFirstValue("age"));
	  //}
	}

	@Get
	public String represent() {
		Form form = getRequest().getResourceRef().getQueryAsForm(); // 获取查询参数
		String movie = form.getFirstValue("movie"); // 获取key=movie的参数值
		//return "电影正在播放，电影名称：" + movie+raceID;
		return "hello, world"+raceID+movie;
	}
	
/*	@Post
	public String represent2() {
		//Form form = getRequest().getResourceRef().getQueryAsForm(); // 获取查询参数
		//String movie = form.getFirstValue("movie"); // 获取key=movie的参数值
		//return "电影正在播放，电影名称：" + movie+raceID;
		return "hello, world";
	}*/
	
    @Post  
    public String uploadMovie(JsonRepresentation mivieJson) throws JSONException{  
        /*JSONObject movie = mivieJson.getJsonObject();    
        String result = String.format("upload movie{name:%s size:%d minutes:%d} success!" ,  
                movie.get("name") ,      
                movie.get("size"),  
                movie.get("minutes"));
        return result;*/
    	JSONObject movie = mivieJson.getJsonObject();  
    	System.out.println(movie.get("name"));
    	String ret = "false"+raceID;
    	return ret;
    }  
    
    @Put
    public String represent3() {
        return "hello, world"+raceID;
    }
    
    @Delete
    public String represent4() {
        return "hello, world"+raceID;
    }
    
}
