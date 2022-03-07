import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTests {

    @Test
    public void shouldResturnAnything(){
        RestAssured client = new RestAssured();
    }
}
