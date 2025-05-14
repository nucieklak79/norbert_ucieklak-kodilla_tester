package com.kodilla.rest.controller;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;


public class JsonPlaceholderUpdateTest {
    @Test
    public void updatePostTest() {
        String updatedTitle = "Updated title";

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body("{ \"title\": \"" + updatedTitle + "\" }")
                .when()
                .patch("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("title", equalTo(updatedTitle))
                .body("id", equalTo(1));
    }
}
