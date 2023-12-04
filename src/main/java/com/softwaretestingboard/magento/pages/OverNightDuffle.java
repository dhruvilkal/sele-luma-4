package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDuffle extends Utility {
    By verifyTextOverNightDuffle = By.xpath("//span[@class='base']");

    //click on box
    By clickOnBox = By.xpath("//input[@id='qty']");
    //clear box
    By clearBox = By.xpath("//input[@id='qty']");
    //send text
    By addInBox = By.xpath("//input[@id='qty']");

    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By verifyTextYouAddedOverNightDuffleToYourShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

By shoppingCart2 = By.xpath("//a[normalize-space()='shopping cart']");





    public String getVerifyTextOverNightDuffle(){
        return getTextFromElement(verifyTextOverNightDuffle);

    }
    public void clickOnBox(){
        mouseHoverToElementAndClick(clickOnBox);
    }
    public void clearQuantityBox(){
        clearInput(clearBox);
    }
    public void addInBox(String Quantity){
        sendTextToElement(addInBox,Quantity);
    }
    public void addToCartButton(){
        mouseHoverToElementAndClick(addToCart);
    }
    public String getVerifyTextYouAddedOverNightDuffleToYourShoppingCart(){
        return getTextFromElement(verifyTextYouAddedOverNightDuffleToYourShoppingCart);
    }
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart2);
    }
}
