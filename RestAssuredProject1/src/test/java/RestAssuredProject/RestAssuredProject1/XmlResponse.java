package RestAssuredProject.RestAssuredProject1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class XmlResponse {
	

	@Test
	void getUser() {
		//Approach -1
		
//	given()
//	
//	.when()
//		.get("http://restapi.adequateshop.com/api/Traveler?page=1")
//	
//	.then()
//		.statusCode(200)
//		.header("content-Type", "application/json; charset=utf-8")
//		.body("TravelerinformationResponse.page", equalTo("1"))
//		.body("TravelerinformationResponse.travelers.Travelinformation[0].name", equalTo("Vijay Bharath Reddy"));
//	
	}
	

}
