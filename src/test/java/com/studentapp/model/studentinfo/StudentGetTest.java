package com.studentapp.model.studentinfo;

import com.studentapp.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StudentGetTest extends TestBase {
    @Test
    public void searchingStudent(){
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void singleStudent(){
        Response response = given()
                .when()
                .get("/40");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchWithParameter() {
        Response response = given()
                .pathParam("id", 60)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchWithQueryParams(){
        Response response = given()
                .queryParam("programme", "Financial Analysis")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }
@Test
    public void searchWithQueryparamsAndHasMap(){
    HashMap<String, Object> qParams = new HashMap<>();
    qParams.put("programme", "Computer Science");
    qParams.put("limit", 2);
    Response response = given()
            .queryParams(qParams)
            .when()
            .get("/list");
    response.then().statusCode(200);
    response.prettyPrint();
}

}
