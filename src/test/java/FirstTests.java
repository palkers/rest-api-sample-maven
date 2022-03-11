import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstTests {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api/";
    }

    @Test
    public void getListofUsers() {
        ValidatableResponse response = given().
                when().
                get("users?page=2").
                then().
                statusCode(200).
                log().
                body();
        Assert.assertNotNull(response);
    }
}
