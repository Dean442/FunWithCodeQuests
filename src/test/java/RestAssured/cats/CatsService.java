package RestAssured.cats;
import RestAssured.cats.models.Cat;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CatsService {

    final String catsAPI = "https://cats-service-akros.azurewebsites.net/cats";
    public Response postCat(Cat cat) {
        Response response = RestAssured.given()
                .header("accept", "*/**")
                .header("Content-Type", "application/json")
                .body(cat)
                .post(catsAPI);

        return response;
    }
}
