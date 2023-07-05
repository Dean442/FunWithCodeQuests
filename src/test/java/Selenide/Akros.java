package Selenide;

import com.codeborne.selenide.Configuration;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

@Slf4j
public class Akros {

    //Selenide documentation: https://selenide.org/documentation.html
    private final By cookieAcceptButton = byId("onetrust-accept-btn-handler");
    private final By searchInput = byId("s");
    private final By searchButton = byId("sBtn");
    private final By searchResultsPageTitle = byClassName("pageInnerWrapper");
    private final By searchResultEntry = byClassName("searchWrapper");

    @Test
    public void testOne() {
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";

        open("https://www.akros.ch");
        $(cookieAcceptButton).click();
        $(searchInput).click();

        final var searchInput = $(this.searchInput);
        searchInput.should(exist);
        searchInput.sendKeys("akros");
        $(searchButton).click();

        String title = $(searchResultsPageTitle).getText();
        log.info("Found {} visible search results", $$(searchResultEntry).size());
        log.info("Page title says there are {} search results in total", Integer.parseInt(title.substring(title.indexOf("(") + 1, title.indexOf(")"))));
    }

}
