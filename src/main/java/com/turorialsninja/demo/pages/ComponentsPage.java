package com.turorialsninja.demo.pages;

import com.turorialsninja.demo.utiliy.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComponentsPage extends Utility {
    public ComponentsPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsPageText;


    public String getPageName(){
        Reporter.log("Verify the Components page name" + componentsPageText.toString());
        return getTextFromElement(componentsPageText);
    }
}
