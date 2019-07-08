import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;	
 	
	public class Excludefewfields {
	
	  public static void main(String args[]) {
	    Player obj = new Player();
	    String jsonString = null;
	    obj.age = 29;
	    obj.name = "Alex";
	    obj.gender = "Male";
	    //Gson gson = new Gson();
	   GsonBuilder builder = new GsonBuilder();
	    builder.excludeFieldsWithoutExposeAnnotation();
	    Gson gson =builder.create();
	    jsonString = gson.toJson(obj);
	    System.out.println(jsonString);
	
	  }
	
	}

 


