package RestAssuredProject.RestAssuredProject1;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Ways_To_Create_PostReq {

	//Hashmap
	
	//@Test(priority = 1) (in testng if you comment the test annotation it won't run)
	void createUser1()
	{
		HashMap data = new HashMap();
		data.put("Name", "Ram");
		data.put("Loacation", "Pune");
		data.put("Phone", "1234567890");
		
		String[] coursearray = {"C", "C++"};
		data.put("Courses", coursearray);
		
		given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("http://localhost:3000/students")
			
		.then()
			.statusCode(201)
			.body("Name", equalTo("Ram"))
			.body("Location", equalTo("Pune"))
			.body("Phone", equalTo("1234567890"))
			.body("Courses[0]", equalTo("C"))
			.body("Courses[1]", equalTo("C++"))
			.header("content-Type", "application/json; charset=utf-8")
			.log().all();
	}

	
	//using org.json library
	
	@Test
	void createUser2()
	{
	 JSONObject data = new JSONObject();
	 	data.put("Name", "Ram");
		data.put("Loacation", "Pune");
		data.put("Phone", "1234567890");
		
		String[] coursearray = {"C", "C++"};
		data.put("Courses", coursearray);
		

	given()
		.contentType("application/json")
		.body(data.toString())
		
	.when()
		.post("http://localhost:3000/students")
		
	.then()
		.statusCode(400)
		.body("Name", equalTo("Ram"))
		.body("Location", equalTo("Pune"))
		.body("Phone", equalTo("1234567890"))
		.body("Courses[0]", equalTo("C"))
		.body("Courses[1]", equalTo("C++"))
		.header("content-Type", "application/json; charset=utf-8")
		.log().all();
	}
	
	
	//pojo class
	@Test
	void createUser3()
	{
	PojoClass data = new PojoClass();
	data.setName("Ram");
	data.setName("Pune");
	data.setName("1234567890");
	
	String[] coursearray = {"C", "C++"};
	data.setCourse(coursearray);
	
	
		

	given()
		.contentType("application/json")
		.body(data)
		
	.when()
		.post("http://localhost:3000/students")
		
	.then()
		.statusCode(400)
		.body("Name", equalTo("Ram"))
		.body("Location", equalTo("Pune"))
		.body("Phone", equalTo("1234567890"))
		.body("Courses[0]", equalTo("C"))
		.body("Courses[1]", equalTo("C++"))
		.header("content-Type", "application/json; charset=utf-8")
		.log().all();
	
	
}


// using external file

@Test
void createUser4()
{


	

given()
	.contentType("application/json")
	//.body(data)
	
.when()
	.post("http://localhost:3000/students")
	
.then()
	.statusCode(400)
	.body("Name", equalTo("Ram"))
	.body("Location", equalTo("Pune"))
	.body("Phone", equalTo("1234567890"))
	.body("Courses[0]", equalTo("C"))
	.body("Courses[1]", equalTo("C++"))
	.header("content-Type", "application/json; charset=utf-8")
	.log().all();
}

}