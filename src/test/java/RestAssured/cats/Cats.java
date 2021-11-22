package RestAssured.cats;

import RestAssured.cats.models.Cat;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Cats {

    private CatsService catsService = new CatsService();

    @Test
    public void postCatTest() {
        Cat cat = new Cat("name","color", "character", "gender", 100);

        Response response = catsService.postCat(cat);
        response.prettyPrint();
    }
}
