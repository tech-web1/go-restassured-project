package com.gorest.crudtest;

public class UserCrudTest {
//    static String token = "f8f231911770bd29394ba6350b92e3e88b00d7f482a4b763d244d3d42f395d19";


//    @BeforeClass
//    public static void inIt() {
//        RestAssured.baseURI = "https://gorest.co.in";
//// RestAssured.port = 3030;
//    }
//
//    @Test()
//    public void verifyUserCreatedSuccessfully() {
//
//        UserPojo userPojo = new UserPojo();
//        userPojo.setName("Shaif");
//        userPojo.setEmail("prime1237@gmail.com");
//        userPojo.setGender("Female");
//        userPojo.setStatus("active");
//// make request to server to create new user
//        Response response = given()
//                .headers("Content-Type", "application/json", "Authorization", "Bearer " + token)
//                .when()
//                .body(userPojo)
//                .post("/public/v2/users");
//
////To fetch response from server
//        response.then().log().all().statusCode(201);
//
//        String responseBody = response.getBody().asString();
//        JsonPath jsonPath = new JsonPath(responseBody);
//        int userId = jsonPath.getInt("id");
//        System.out.println("user id " + userId);
//    }
//
//    private MultiPartSpecBuilder given() {
//    }
//
}
