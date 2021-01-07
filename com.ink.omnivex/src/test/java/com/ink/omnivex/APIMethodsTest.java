package com.ink.omnivex;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIMethodsTest {
	
	
	@Test
    public void getUsers()
    {
        RestAssured.baseURI = "https://reqres.in/api/users";

        //Define the specification of request. Server is specified by baseURI above.
        RequestSpecification httpRequest = RestAssured.given();

        //Makes calls to the server using Method type.
        Response response = httpRequest.request(Method.GET);
        response.prettyPrint();

        //Checks the Status Code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void postUsers()
    {

    }

}
