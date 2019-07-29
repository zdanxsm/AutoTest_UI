package com.myselfTest.pages;

import com.myselfTest.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage extends TestBase {
    @FindBy(xpath = "//div[contains(@class,menu-list)]/ul/li/a[contains(text(),'国内')]")
    WebElement gnBtn;

    // Initializing the Page Objects:
    public NewsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getNewsPageTitle(){
        return driver.getTitle();
    }

    public void gnClick(){
        gnBtn.click();
    }
}
