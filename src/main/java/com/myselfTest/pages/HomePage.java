package com.myselfTest.pages;

import com.myselfTest.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//div[@class='head_wrapper']//a[contains(text(),'新闻')]")
    WebElement newsBtn;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    //Actions:
    public String getHomePageTitle(){
        return driver.getTitle();
    }

    public NewsPage initNewsPage(){
        newsBtn.click();

        return new NewsPage();
    }
}
