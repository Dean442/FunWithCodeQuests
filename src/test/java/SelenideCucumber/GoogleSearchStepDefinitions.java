package SelenideCucumber;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchStepDefinitions {

    private final By acceptGoogleTermsSelector = byId("L2AGLb");

    @Given("an open browser with google.com")
    public void openGoogleSearch() {
        Configuration.reportsFolder = "target/surefire-reports";
        Configuration.headless = false;
        open("https://google.com/ncr");

        if ($(acceptGoogleTermsSelector).isDisplayed()) {
            $(acceptGoogleTermsSelector).click();
            $(acceptGoogleTermsSelector).should(disappear);
        }
    }

    @When("a keyword {string} is entered in input field")
    public void enterKeyword(String keyword) {
        $(By.name("q")).val(keyword).pressEnter();
    }

    @Then("at least top {int} matches should be shown")
    public void topTenMatchesShouldBeShown(int resultsCount) {
        $$("#res .g").shouldHave(sizeGreaterThanOrEqual(resultsCount));
    }

    @Then("the first one should contain {string}")
    public void theFirstOneShouldContainKeyword(String expectedText) {
        $("#res .g").shouldHave(text(expectedText));
    }

}
