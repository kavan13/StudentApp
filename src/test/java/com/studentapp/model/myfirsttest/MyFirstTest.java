package com.studentapp.model.myfirsttest;

import com.studentapp.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestBase {

    @Test
    public void getAllStudentInfo() {
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleStudent() {
        Response response = given()
                .when()
                .get("/15");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchStudentWithParameter() {
        Response response = given()
                .pathParam("id", 50)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchStudentWithQueryParameter() {
        Response response = given()
                .queryParam("programme", "Financial Analysis")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchStudentWithQueryParameter1() {
        Response response = given()
                .queryParam("programme", "Computer Science")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchStudentWithQueryParameterWithHashMap() {
        HashMap<String, Object> qParams = new HashMap<>();
        qParams.put("programme", "Computer Science");
        qParams.put("limit", 3);
        Response response = given()
                .queryParams(qParams)
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchStudentWithQueryParameterWithHashMap1() {
        HashMap<String, Object> qParams1 = new HashMap<>();
        qParams1.put("programme", "Disaster Management");
        qParams1.put("programme", "Computer Science");

        qParams1.put("limit", 3);
        Response response = given()
                .queryParams(qParams1)
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}