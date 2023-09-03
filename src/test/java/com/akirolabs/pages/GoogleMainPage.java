package com.akirolabs.pages;

import com.akirolabs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    public GoogleMainPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement GoogleSearchField;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    public WebElement GoogleSearchBtn;




}
