package TOTP;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EportalPage {

    String url = "https://eportal-r.admin.ch";

    public EportalPage() {}

    public void gotTo() {
        open(url);
    }


    private SelenideElement loginButton() {
        return $(byId("loginButton")).should(Condition.appear);
    }

    public EiamPage startLogin() {
        loginButton().click();
        return new EiamPage();
    }
}
