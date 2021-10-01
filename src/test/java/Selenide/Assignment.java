package Selenide;

import com.codeborne.selenide.Configuration;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

@Slf4j
public class Assignment {

    //Selenide documentation: https://selenide.org/documentation.html

    @Test
    public void testOne() {
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";

        //TODO: go to https://www.google.com
        open( "https://www.google.com");

        //TODO: get rid of terms of service
        $(byText("I agree")).click();

        //TODO: ensure the existence of the searchbar
        final var input = $("input");
        input.should(exist);
        //TODO: search for Manuel Grädel
        input.sendKeys("Manuel Grädel");

        //TODO: switch to picture tab
        input.pressEnter();


        //TODO: find the Picture from the akros website and click on it
        $(byText("Images")).click();

        //TODO: visit the akros website using the link on the picture
        $(byText("Qualitätsmanagement")).click();

        //TODO: accept cookies
        switchTo().window(1);
        final var acceptCookies = $("button#onetrust-accept-btn-handler").should(appear);
        acceptCookies.click();

        //TODO: scroll to the Testautomation text
        $(byText("Testautomation")).scrollIntoView(true);

        //TODO: take a 'nice' screenshot of Testautomation section. No sleeps.
        acceptCookies.should(disappear);
        screenshot("test");


    }

}
