package com.demo_task.pages;

import com.demo_task.utiliies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ClothingPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='text-h1 uppercase tracking-")
    WebElement clothingText;

    public String getText(){
        return driver.getTitle();
    }
}
