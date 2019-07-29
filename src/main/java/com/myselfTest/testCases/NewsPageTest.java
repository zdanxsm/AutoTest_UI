package com.myselfTest.testCases;

import com.myselfTest.base.TestBase;
import com.myselfTest.pages.HomePage;
import com.myselfTest.pages.NewsPage;
import com.myselfTest.utils.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageTest extends TestBase {
    HomePage homePage;
    NewsPage newsPage;
    TestUtil testUtil;

    public NewsPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        homePage = new HomePage();
        newsPage = homePage.initNewsPage();
    }

    @Test(priority=1)
    public void verifyNewsPageTitleTest(){
        String homePageTitle = newsPage.getNewsPageTitle();
        Assert.assertNotEquals(homePageTitle, "ssss");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
