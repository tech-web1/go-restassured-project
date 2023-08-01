package com.gorest.testsuite;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;

public class UserAssertionTest {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {

        HashMap<String, Object> qParam = new HashMap<>();
        qParam.put("page", "1");
        qParam.put("per_page", "20");
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2/";
        response = given()
                .queryParams(qParam)
                .when()
                .get("/users")
                .then().statusCode(200);
    }


    //   1. Verify the if the total record is 20
    @Test
    public void testRecord() {
        response.body("id.size()", equalTo(20));
    }


    // 2. Verify the if the name of id = 5487 is equal to ”Hamsini Trivedi”
    @Test
    public void test002() {
        response.body("[5].name", equalTo("Bhima Chaturvedi"));
    }

    //3. Check the single ‘Name’ in the Array list (Subhashini Talwar)
    @Test
    public void test003() {
        response.body("[2].name", equalTo("Vishnu Agarwal"));
    }

    //4. Check the multiple ‘Names’ in the ArrayList (Mrs. Menaka Bharadwaj, Msgr. BodhanGuha, Karthik Dubashi IV)
    @Test
    public void test004() {
        response.body(".name", hasItems("Chaturbhuj Reddy", "Tushar Ahluwalia", "Bhagwati Devar"));
    }

    //5. Verify the emai of userid = 5471 is equal “adiga_aanjaneya_rep@jast.org”
    @Test
    public void test005() {
        response.body(".[7].email", hasKey("dhanesh_phd_arora@maggio.test"));
    }



    // 6. Verify the status is “Active” of user name is “Shanti Bhat V”
    @Test
    public void test006() {
        response.body("data.findAll{it.status==Active}",hasItem(hasEntry("status","Active"));

    // 7. Verify the Gender = male of user name is “Niro Prajapat”
//        @Test
//       public void test007(){
//            response.body(".Gender",equalTo("Triloki Mukhopadhya");
//
//        }





    }
    }



