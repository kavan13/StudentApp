package com.studentapp.model.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.model.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {
    @Test
    public void createStudent(){
        List<String> courseList = new ArrayList<>();
        courseList.add("Finance");
        courseList.add("Maths");
        courseList.add("Accounts");
        courseList.add("Programming");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Abcd");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail("abcd21@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(courseList);



        Response response = given()
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }
@Test
    public void createStudent2(){
        List<String> listCourse = new ArrayList<>();
        listCourse.add("Vertical");
        listCourse.add("Horizonetal");
        listCourse.add("Long");
        listCourse.add("Short");


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("XYZA");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail("xyza21@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(listCourse);

        Response response = given()
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }
    @Test
    public void createStudent3(){
        List<String> listCourse1 = new ArrayList<>();
        listCourse1.add("Ver");
        listCourse1.add("Hori");
        listCourse1.add("Run");
        listCourse1.add("Stop");


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("qwer");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail("poiu21@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCourses(listCourse1);

        Response response = given()
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
