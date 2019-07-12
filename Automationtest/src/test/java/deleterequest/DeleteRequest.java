package deleterequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class DeleteRequest {
	
	public void deleteRequest() 
	{
		RequestSpecification request=RestAssured.given();
		Response response=request.delete("http://localhost:8084/employee/E03");
		int code=response.getStatusCode();
		Assert.assertEquals(code,200);
	}
}
