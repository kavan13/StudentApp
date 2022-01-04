package com.studentapp.model.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentPatchTest extends TestBase {
    @Test
    public void patchStudentRecord(){
        StudentPojo st = new StudentPojo();
        st.setEmail("kjhgf@gmail.com");
        Response response = given()
                .pathParam("id",55)
                .header("Content-Type","application/json")
                .body(st)
                .when()
                .patch("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void patchStudentRecord1(){
        StudentPojo sp = new StudentPojo();
        sp.setEmail("qwert@gmail.com");
        Response response = given()
                .pathParam("id",62)
                .header("Content-Type","application/json")
                .body(sp)
                .when()
                .patch("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
