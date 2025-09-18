package RestAssuredProject.RestAssuredProject1;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class User_Header {
	
	@Test
	void getUser() {
		
	given()
	
	.when()
		.get("https://www.google.com")
	
	.then()
		.header("Content-Encoding", "gzip") 
		.and()
		.header("Server", "gws");

		
	
	}
	
	void getUser2() {
		
	Response res = given()
	
	.when()
		.get("https://www.google.com");
	
	//single header value
	
	//String headerValue = res.getHeader("Content-Encoding");
	//System.out.println("header value ---> " + headerValue);
	
	//all headers
	
	Headers myheaders =res.getHeaders();
	
	for(Header hd : myheaders)
	{
		System.out.println(hd.getName()+ "    "+hd.getValue());
	}
	
	
		
	
	}
	

}
