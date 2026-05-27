package api.tests;

import api.config.TestConfig;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsNull.notNullValue;

public class ProductTests {

    @Test
    public void getSingleProduct() {
        // GET https://api.practicesoftwaretesting.com/products/id
        Response response =
                given()
                        .when()
                        .get(TestConfig.BASE_URL + "/products")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        String id = response.jsonPath().getString("data[0].id");

        given()
                .when()
                    .get(TestConfig.BASE_URL + "/products/" + id)
                .then()
                    .statusCode(200)
                    .body("name", notNullValue());

    }
}