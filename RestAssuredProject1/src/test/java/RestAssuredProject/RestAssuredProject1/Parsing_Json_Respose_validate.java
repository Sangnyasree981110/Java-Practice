package RestAssuredProject.RestAssuredProject1;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Parsing_Json_Respose_validate {
	
	@Test
	void getUser() {
	
		//Approach -1
		
	given()
	
	.when()
		.get("http://localhost:3000/stores")
	
	.then()
		.statusCode(200)
		.header("content-Type", "application/json; charset=utf-8")
		.body("book[3].title", equalTo("The lord of rings"));
	
	
	//Approach -2
	
	Response res =given()
			.contentType(ContentType.JSON)
	
	.when()
		.get("http://localhost:3000/stores");
		
//		Assert.assertEquals(res.getSessionId(), 200);
//		Assert.assertEquals(res.header("content-Type" ), "application/json; charset=utf-8");
//		
//		String bookName =res.jsonPath().get("Book[3].title.").toString();
//		Assert.assertEquals(bookName, "The lord of rings");
		
	}
		@Test
		void getUser2() {
		
		
			
		Response res =	given()
				.contentType(ContentType.JSON)
		
		.when()
			.get("http://localhost:3000/stores");
			
		//using json object
		
		JSONObject jo = new JSONObject(res.toString());	
		
		
		//print all the titles of book
		boolean status = false;
		for(int i =0 ; i<jo.getJSONArray("Book").length();i++)
		{
			String bookTitle =  jo.getJSONArray("Book").getJSONObject(i).get("title").toString();
			System.out.println(bookTitle);
			
			
			
			if(bookTitle.equals("The lord of rings"))
			{
				status = true;
				break ;
			}
		}
		Assert.assertEquals(status, true);
		
		
		//validate total price
		double totalPrice =  0;
		
		for(int i =0 ; i<jo.getJSONArray("Book").length();i++)
		{
			String price =  jo.getJSONArray("Book").getJSONObject(i).get("Price").toString();
			totalPrice = totalPrice+Double.parseDouble(price);
		
		}
		System.out.println("total price of books " + totalPrice);
	}

}
