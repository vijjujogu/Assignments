package putrequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class PutRequest {
	
	public void putRequest() 
	{
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json=new JSONObject();
		json.put("empNo", "123");
		json.put("empName", "amu");
		json.put("position","dev");
		request.body(json.toJSONString());
		Response response=request.put("http://localhost:8084/employee");
		int code=response.getStatusCode();
		Assert.assertEquals(code,200);
	}
}
