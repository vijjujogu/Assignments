package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Test
public class GetData {
	
	public void testResponseCode()
	{
		Response response=RestAssured.get("http://localhost:8084/employees");
		int code = response.getStatusCode();
		System.out.println("status code is"+code);
		Assert.assertEquals(code,200);
		
	}
	
	public void testResponsebody()
	{
		Response response=RestAssured.get("http://localhost:8084/employees");
		String data = response.asString();
		System.out.println("Data is"+data);
		
	}
	
}
