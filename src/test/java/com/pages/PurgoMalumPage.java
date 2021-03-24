package com.pages;

import io.restassured.http.Method;
import org.openqa.selenium.remote.Response;

import static io.restassured.RestAssured.given;

public class PurgoMalumPage {
    public static Response getText(String text){

        Response response = given().
                baseUri(TestDataReader.get("purgoMalumUri")).
                basePath("json").
                queryParam("text", text).
                request(Method.GET).prettyPeek();

        return response;
    }
}
