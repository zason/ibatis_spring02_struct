package firstSteps;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.json.*;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import po.Person;
import dao.impl.ActionImpl;
/**
 * Resource which has only one representation.
 */
public class HelloWorldResource extends ServerResource {
	private static ApplicationContext applicationContext = null;   //提供静态ApplicationContext
	static{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //实例化
	}
    @Put
    public String represent3() {
        return "hello, world";
    }
	
    @Get
    public String representu() {
    	ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");
		s.insertPerson(new Person(4,"zhangsan",20));
        return "hello, world3";
    }
    
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
    	String ret = "false";
    	return ret;
    }  
    
    @Delete
    public String represent4() {
        return "hello, world";
    }    
        
}