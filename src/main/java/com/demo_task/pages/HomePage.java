package com.demo_task.pages;

import com.demo_task.utiliies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(id = "clothing")
    WebElement clothing;



    public void mouseHoverOnClothingAndClick() {
        mouseHoverToElementAndClick(clothing) ;
    }


    }
