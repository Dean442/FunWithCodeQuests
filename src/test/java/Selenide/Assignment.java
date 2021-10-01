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


        //TODO: get rid of terms of service


        //TODO: ensure the existence of the searchbar


        //TODO: search for Manuel Grädel


        //TODO: switch to picture tab


        //TODO: find the Picture from the akros website and click on it


        //TODO: visit the akros website using the link on the picture


        //TODO: accept cookies


        //TODO: scroll to the Testautomation text


        //TODO: take a 'nice' screenshot of Testautomation section. No sleeps.


    }

}
