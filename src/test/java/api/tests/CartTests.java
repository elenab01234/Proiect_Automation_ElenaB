package api.tests;

import api.config.TestConfig;
import org.testng.annotations.Test;
import api.utils.TokenUtils;

import static io.restassured.RestAssured.given;

public class CartTests {

    @Test
    public void addProductToCart() {

        String token = TokenUtils.getToken();

        String body = "  {\n" +
                " \"product_id\": 1,\n" +
                " \"quantity\": 1\n" +
                "   }";

        given()
                    .header("Content-Type","application/json")
                    .header("Authorization","Bearer " + token)
                    .body(body)
                .when()
                    // POST https://api.practicesoftwaretesting.com/carts
                    .post(TestConfig.BASE_URL + "/carts")
                .then()
                    .statusCode(201);
                    //   """ {
                    //     "id": "01ksf37r8f2y852bdgnkw728y1"
                    //  } """
    }
}