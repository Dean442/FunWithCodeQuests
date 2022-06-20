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

        open("https://automationintesting.com/selenium/testpage");

        var firstNameInput = $(byId("firstname"));
        firstNameInput.sendKeys("TestFirstName");

        var surNameInput = $(byId("surname"));
        surNameInput.sendKeys("Surname");

        var genderSelect = $(byId("gender"));
        genderSelect.selectOption(1);

        var redRadio = $(byId("red"));
        redRadio.click();

        var blueRadio = $(byId("blue"));
        blueRadio.click();

        var continentSelect = $(byId("continent"));
        continentSelect.selectOption("Africa", "Asia", "Europe");

        var emailCheckBox = $(byId("checkbox1"));
        emailCheckBox.click();

        var smsCheckBox = $(byId("checkbox2"));
        smsCheckBox.click();

        var textArea = $(byTagName("textarea"));
        textArea.sendKeys("some stuff");

        var submitButton = $(byId("submitbutton"));
        submitButton.click();





    }


}
