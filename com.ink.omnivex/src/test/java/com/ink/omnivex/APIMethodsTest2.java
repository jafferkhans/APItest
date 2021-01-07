package com.ink.omnivex;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class APIMethodsTest2 {
    private static final String BASE_URI = "https://reqres.in/api/users";

	
	@Test
    public void getUsers()
    {
		ValidatableResponse response = 
				given()
                	.contentType(ContentType.JSON)
                	.accept(ContentType.JSON)
                .when()
                	.get(BASE_URI)
                .then()
                	.assertThat().statusCode(201);
	}

    @Test
    public void postUsers()
    {

    }

}
