import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UsersTest extends TestBase {

    @Test
    public void getListofUsers() {
        given().
                when().
                get("users?page=2").
                then().
                body("page", equalTo(2)).
                statusCode(200).
                log().
                body();
    }

    @Test
    public void getSingleUser() {
        given().
                when().
                get("/users/1").
                then().
                statusCode(200).
                body("email", equalTo("george.bluth@reqres.in")).
                log();
    }
}
