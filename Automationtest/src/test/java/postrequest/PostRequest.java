package postrequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class PostRequest {
	
	public void postRequest() 
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json=new JSONObject();
		json.put("empNo", "65");
		json.put("empName", "lakshmi");
		json.put("position","automation engineer");
		request.body(json.toJSONString());
		Response response=request.post("http://localhost:8084/employee");
		int code=response.getStatusCode();
		Assert.assertEquals(code,200);
	}
}
