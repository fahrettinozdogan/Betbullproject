package com.utilies;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static String generateToken(String email,String password){

        //incase we need authorization to test some end points

        Response response = given().accept(ContentType.JSON)
                .queryParam("email", email)
                .queryParam("password", password)
                .when().get(ConfigurationReader.get("Uri"));

        //get token from api and save inside the String variable
        String token = response.path("accessToken");

        return token;
    }
}


