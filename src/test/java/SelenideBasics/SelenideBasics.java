package SelenideBasics;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class SelenideBasics {
    //Selenide documentation: https://selenide.org/documentation.html
    // url: https://automationintesting.com/selenium/testpage

    @Test
    public void testOne() {
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();

    }


}