package SelenideBasics;

import com.codeborne.selenide.Configuration;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Slf4j
public class SelenideBasics {
    //Selenide documentation: https://selenide.org/documentation.html
    // url: https://automationintesting.com/selenium/testpage

    @Test
    public void testOne() {
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";

    }


}