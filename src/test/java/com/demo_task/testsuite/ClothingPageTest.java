package com.demo_task.testsuite;

import com.demo_task.pages.ClothingPage;
import com.demo_task.pages.HomePage;
import com.demo_task.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClothingPageTest extends BaseTest  {

        HomePage homePage;
        ClothingPage clothingPage;
        @BeforeMethod
        public void inIt(){
            homePage = new HomePage();
            clothingPage=new ClothingPage();
        }

    @Test
    public void verifyNavigateToClothingPage() throws InterruptedException {

        homePage.mouseHoverOnClothingAndClick();


        Thread.sleep(2000);

        String expectedMessage = "Women's Clothes | Shop Women's Fashion | PrettyLittleThing";
        //String expectedMessage = "Women's Fashion Clothing & Dresses | PrettyLittleThing";
        String actualMessage = clothingPage.getText();
        System.out.println(actualMessage);
       Assert.assertEquals(actualMessage,expectedMessage, " message not displayed");
    }
}
