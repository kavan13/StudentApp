package com.studentapp.model.studentinfo;

import com.studentapp.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteStudent extends TestBase {
    @Test
    public void deleteStudent1(){

        Response response = given()
                .pathParam("id",50)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
