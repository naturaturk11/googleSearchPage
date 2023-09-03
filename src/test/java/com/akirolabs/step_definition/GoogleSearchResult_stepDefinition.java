package com.akirolabs.step_definition;

import com.akirolabs.pages.AkirolabsMainPage;
import com.akirolabs.pages.AkirolabsMainPage;
import com.akirolabs.pages.GoogleMainPage;
import com.akirolabs.utilities.BrowserUtils;
import com.akirolabs.utilities.ConfigurationReader;
import com.akirolabs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class GoogleSearchResult_stepDefinition {

    AkirolabsMainPage akirolabsMainpage=new AkirolabsMainPage();
    GoogleMainPage googleMainPage=new GoogleMainPage();
    String GoogleURL="https://www.google.com/";


    @When("user on the google main page")
    public void userOnTheGoogleMainPage() {
        Driver.getDriver().get(GoogleURL);
    }

    @And("user clicks the google search field")
    public void userClicsTheGoogleSearchField() {
        googleMainPage.GoogleSearchField.click();
        String expectedtitleOfGoogleSearchPage="Google";
        String actualtitleOfGoogleSearchPage=Driver.getDriver().getTitle();
        System.out.println("actualtitleOfGoogleSearchPage= "+ actualtitleOfGoogleSearchPage);
        Assert.assertEquals(expectedtitleOfGoogleSearchPage,actualtitleOfGoogleSearchPage);

    }

    @And("user enters one {string} into the search field")
    public void userEntersOneIntoTheSearchField(String item) {
        googleMainPage.GoogleSearchField.sendKeys(ConfigurationReader.getProperty(item));


    }

    @When("user clicks the google search button")
    public void user_clicks_the_google_search_button() {
         googleMainPage.GoogleSearchBtn.click();
    }
    @When("user should see the results on the result page")
    public void user_should_see_the_results_on_the_result_page() {
       String actualText=akirolabsMainpage.akirolabsSearchingFirstResult.getText();
       String expectedtext="akirolabs: Home";
        System.out.println("actualtext: "+actualText);
        Assert.assertEquals(expectedtext,actualText);


    }
    @When("user clicks the first result")
    public void user_clicks_the_first_result() {
         akirolabsMainpage.akirolabsSearchingFirstResult.click();
    }


    @Then("user should be on the first clicked  page")
    public void userShouldBeOnTheFirstClickedPage() {

        String expectedUrl="https://akirolabs.com/";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL: "+ actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }
}
