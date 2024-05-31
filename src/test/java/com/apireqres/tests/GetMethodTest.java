package com.apireqres.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.apireqres.utilities.EventListenerClass;

import io.restassured.RestAssured;
@Listeners(EventListenerClass.class)//Listening the status of the test
public class GetMethodTest {
	@BeforeClass
	public void setup() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "http://localhost:9742/";//Localhost path please make change accordingly
	}
	
	@Test
	public void getmethod() {
		given()
		.when().get("api/v1/user")//resource path
		.then().assertThat().statusCode(200);//For GET method we need status code OK[200]
	}
	

}
