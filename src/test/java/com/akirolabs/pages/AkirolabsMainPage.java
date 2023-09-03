package com.akirolabs.pages;

import com.akirolabs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AkirolabsMainPage {
    public AkirolabsMainPage() {PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h3[.='akirolabs: Home']")
    public WebElement akirolabsSearchingFirstResult;
    @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div/div[1]/div/a/img")
    public WebElement logoOfAkirolabsMainPage;












}
