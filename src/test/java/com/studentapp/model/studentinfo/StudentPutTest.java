package com.studentapp.model.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {
    @Test
    public void putStudentRecord() {
        List<String> list = new ArrayList<>();
        list.add("Ver");
        list.add("Hori");
        list.add("Run");
        list.add("Stop");


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("qwerki");
        studentPojo.setLastName("Testing1");
        studentPojo.setEmail("poiew21@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(list);

        Response response = given()
                .pathParam("id",58)
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .put("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void putStudentRecord1() {
        List<String> list1 = new ArrayList<>();
        list1.add("Ver1");
        list1.add("Hori1");
        list1.add("Run1");
        list1.add("Stop1");


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("qgtwerki");
        studentPojo.setLastName("Testing12");
        studentPojo.setEmail("poiew31@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(list1);

        Response response = given()
                .pathParam("id",48)
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .put("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    }
