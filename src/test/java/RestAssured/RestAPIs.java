
package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;



public class RestAPIs {

    /**
     * URI: https://quotes.rest/
     * Careful: only 10 requests per hour permitted
     *
     */



    @Test
    public void getQuoteOfTheDay() {
        //get the quote of the day and assure we have the right status before printing the quote and its author and return the response

    }

}