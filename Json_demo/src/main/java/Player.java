import java.util.LinkedList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Player {
  public String name;
  public transient String gender;
  public int age;
  public List gamesplayed = new LinkedList();
	
	/**@Expose(serialize = true, deserialize = true)
	  public String name;
	  @Expose(serialize = false, deserialize = false)
	  public String gender;
	  @Expose(serialize =true, deserialize = true)
	  public int age;
	  public List gamesplayed = new LinkedList();**/

}

