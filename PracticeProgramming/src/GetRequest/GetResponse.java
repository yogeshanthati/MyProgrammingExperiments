/*package GetRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class GetResponse {

	
	@Test
	public void GetResponse(){
	
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification httpreq=RestAssured.given();
		Response response=httpreq.get();
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		JsonPath jspath=response.jsonPath();
		System.out.println(jspath.get("total"));
		
		  List<Map<String, ?>> companies = response.jsonPath().getList("data");
		  
	      System.out.println(companies.get(1).size());
		
		for(int i=0;i<companies.get(1).size()-1;i++){
			
			System.out.println((companies.get(i).get("first_name")));
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httpReq  =	RestAssured.given();
		JSONObject jsonparam =new JSONObject();
		jsonparam.put("email","sydney@fife");
		jsonparam.put("password","pistol");
		jsonparam.put("Username","Yogesh946445");
		jsonparam.put("Password","Yogesh1234");
		"name": "morpheus",
	    "job": "leader"
		{https://reqres.in/api/register
		    "email": "sydney@fife",
		    "password": "pistol"
		}
		
		httpReq.body(jsonparam.toJSONString());
		Response Response=httpReq.get("/api/users");
		System.out.println(Response.getStatusCode());
		Assert.assertEquals(201, Response.getStatusCode());
		
		
		
		
		
		
		
		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");
	 
		requestParams.put("Email",  "sample2ee26d9@gmail.com");
		request.body(requestParams.toJSONString());
		Response response = request.post("/register");
	 
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		
		
		
		
		
		
		
		RestAssured rest=new RestAssured();
		
		Response response=rest.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int status=response.getStatusCode();
		Assert.assertEquals(status, 200);
		System.out.println(status);
		System.out.println("The response data"+response.asString());
		System.out.println("Responsetime"+response.getTime());
		
		//Response Re=rest.post("");
		
		RestAssured.baseURI="http://samples.openweathermap.org/data/2.5";
		RequestSpecification httpReq= RestAssured.given();
		Response response=httpReq.get("/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getHeader("Content-Type"));
		Headers headers=response.getHeaders();
		
	
			for (Header header : headers) {
				
				System.out.println("Header is "+header.getName()+"Header Value is"+header.getValue());
			}
			 ResponseBody body=response.getBody();
			System.out.println(body.asString());
			JsonPath js=response.jsonPath();
			String city=js.get("base");
			System.out.println(js.get("weather"));
			System.out.println(city);
			
			
			
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

*/