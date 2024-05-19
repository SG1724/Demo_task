package com.demo_task.utiliies;

import com.demo_task.browserfactory.ManageBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility extends ManageBrowser {
    //*************************** Action Methods ***************************************//

     // This method will use to hover mouse on element and click

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }





    public String getTextFromElement(WebElement element) {
        return element.getText();
    }



    }
