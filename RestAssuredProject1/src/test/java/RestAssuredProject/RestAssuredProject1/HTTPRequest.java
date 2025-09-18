package RestAssuredProject.RestAssuredProject1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class HTTPRequest {
	
	@Test
	void getUser() {
	given()
	
	.when()
		.get("https://reqres.in/api/users/2")
	
	.then()
		.statusCode(200);
	
	}
	
	
	@Test
	void createUser()
	{
		
	HashMap data = new HashMap();
	data.put("name", "Rohan");
	data.put("job", "Doctor");
	
		given()
			.body(data)
		
		.when()
		 	.contentType("application/json")
		 	.post("https://reqres.in/api/users")
		 	
		.then()
			.statusCode(401)
			.log().all();
			
		
		
		
	}

}
