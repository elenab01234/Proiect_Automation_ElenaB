package api.utils;


import api.config.TestConfig;
import api.data.TestData;

import static io.restassured.RestAssured.given;

public class TokenUtils {
    public static String getToken() {
        // POST https://api.practicesoftwaretesting.com/users/login
        //  """ {
        //     "email": "customer@practicesoftwaretesting.com",
        //     "password": "welcome01"
        //    } """
        String body = "{\n" +
                "  \"email\": \""+ TestData.EMAIL + "\",\n" +
                "  \"password\": \"" + TestData.PASSWORD + "\"\n" +
                "}";


        String accessToken= given()
                    .header("Content-Type","application/json")
                    .body(body)
                .when()
                    .post(TestConfig.BASE_URL + "/users/login")
                .then()
                    .statusCode(200)
                    .extract()
                    .path("access_token");

        return accessToken;
        //  """
        //  "access_token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2FwaS5wcmFjdGljZXNvZnR3YXJldGVzdGluZy5jb20vdXNlcnMvbG9naW4iLCJpYXQiOjE3Nzk2OTczNDcsImV4cCI6MTc3OTY5NzY0NywibmJmIjoxNzc5Njk3MzQ3LCJqdGkiOiI5cGRlWGhHU2RsOHhGbXJ6Iiwic3ViIjoiMDFLU0YyQ0Y4UEs5QVk0MU1GWVZQVzY1SlAiLCJwcnYiOiIyM2JkNWM4OTQ5ZjYwMGFkYjM5ZTcwMWM0MDA4NzJkYjdhNTk3NmY3Iiwicm9sZSI6InVzZXIifQ.c-Xx2aCQIEhHh7JrEc8dvYNWDitclRNu90EniY3dEgI",
        //  """
    }
}
