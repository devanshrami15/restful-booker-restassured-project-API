package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class DeleteTest extends TestBase {

    @Test
    public void deleteBookingById() {

        Response response = given()
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .header("Content-Type", "application/json")
                .pathParam("id", 648)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.then().time(lessThan(3000L));
        response.prettyPrint();
    }
}

