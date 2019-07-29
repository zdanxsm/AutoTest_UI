package com.myselfTest.testCases;

import com.myselfTest.base.TestBase;
import com.myselfTest.pages.HomePage;
import com.myselfTest.pages.NewsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage;
    NewsPage newsPage;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        initialization();
        homePage = new HomePage();
    }

    @Test(priority=1)
    public void homePageTitleTest(){
        String title = homePage.getHomePageTitle();
        Assert.assertEquals(title, "百度一下，你就知道");
    }


    @Test(priority=2)
    public void initJumpTest(){
        newsPage = homePage.initNewsPage();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
