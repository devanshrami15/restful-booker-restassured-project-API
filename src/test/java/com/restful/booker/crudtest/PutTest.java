package com.restful.booker.crudtest;


import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PutTest extends TestBase {

    @Test
    public void updateBookingById() {

        BookingPojo.BookingDates dates = new BookingPojo.BookingDates();
        dates.setCheckin("2018-01-01");
        dates.setCheckout( "2019-01-01");

        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Abcd");
        bookingPojo.setLastname("wxyz");
        bookingPojo.setTotalprice(11451);
        bookingPojo.setDepositpaid(false);
        bookingPojo.setBookingdates(dates);
        bookingPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .header("Content-Type", "application/json")
                .header("Cookie", "token=1f8f6bb72e6f21c")
                .pathParam("id", 648)
                .body(bookingPojo)
                .when()
                .put("/booking/{id}");
        response.then().statusCode(200);
        response.then().time(lessThan(3000L));
        response.prettyPrint();
    }
}