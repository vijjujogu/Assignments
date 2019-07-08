import java.io.*; 
import java.util.*; 
import org.json.simple.*; 

public class Jsonwriteeg {

	 public static void main(String[] args) throws FileNotFoundException  
	    { 
	        // creating JSONObject 
	        JSONObject jo = new JSONObject(); 
	          
	        // putting data to JSONObject 
	        jo.put("firstName", "vani"); 
	        jo.put("lastName", "Reddy"); 
	        jo.put("age", 20); 
	          
	        // for address data, first create LinkedHashMap 
	        Map m = new LinkedHashMap(4); 
	        m.put("streetAddress", "3-4-78/A"); 
	        m.put("city", "Hyderabad"); 
	        m.put("state", "Telangana"); 
	        m.put("postalCode", 500080); 
	          
	        // putting address to JSONObject 
	        jo.put("address", m); 
	          
	        // for phone numbers, first create JSONArray  
	        JSONArray ja = new JSONArray(); 
	          
	        m = new LinkedHashMap(2); 
	        m.put("type", "home"); 
	        m.put("number", "212 555-1234"); 
	          
	        // adding map to list 
	        ja.add(m); 
	          
	        m = new LinkedHashMap(2); 
	        m.put("type", "fax"); 
	        m.put("number", "212 555-1234"); 
	          
	        // adding map to list 
	        ja.add(m); 
	          
	        // putting phoneNumbers to JSONObject 
	        jo.put("phoneNumbers", ja); 
	          
	        // writing JSON to file:"JSONExample.json" in cwd 
	        PrintWriter pw = new PrintWriter("JSONExample.json"); 
	        pw.write(jo.toJSONString()); 
	          
	        pw.flush(); 
	        pw.close(); 
	    } 
}
