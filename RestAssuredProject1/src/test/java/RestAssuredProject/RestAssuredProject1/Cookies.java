package RestAssuredProject.RestAssuredProject1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;

import io.restassured.response.Response;

import org.testng.annotations.Test;



public class Cookies {

	@Test
	void getUser() {
		
	given()
	
	.when()
		.get("https://www.google.com")
	
	.then()
		.cookie("AEC", "yuijhhyjjjiko89iooll") //cookie name , cookie value , value will keep changing so it will 
		.log().all();
	
	}
	

	@Test
	void getUser2() {
		
		Response res = given()

	.when()
		.get("https://www.google.com");
	
	//single cookie info
		//String cookievalue = res.getCookie("AEC");
		//System.out.println("cookie value ---> " + cookievalue);
		
	//get all cookie info
		Map<String , String> cookieName = res.getCookies();
		for(String key : cookieName.keySet())
		{
			String cookievalue = res.getCookie(key);
		
		System.out.println("Key " + key + "Value " + cookievalue);
		
		}
	}
	
}
