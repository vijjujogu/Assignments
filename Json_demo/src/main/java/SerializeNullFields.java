import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class SerializeNullFields {
	  public static void main(String args[]) {
	    Player obj = new Player();
	    obj.age = 29;
	    obj.name = "Alex"; 
	    obj.gender = null;
	    Gson gson = new Gson();
	    System.out.println("Without NullSerialize:"+gson.toJson(obj));
	    GsonBuilder builder = new GsonBuilder();
	    gson = builder.serializeNulls().create();
	    System.out.println("With    NullSerialize:"+gson.toJson(obj));
	  }
	}

