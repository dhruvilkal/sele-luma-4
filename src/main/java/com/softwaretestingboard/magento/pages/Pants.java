package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Pants extends Utility {
    By cronusYogaPant = By.xpath("//img[@alt='Cronus Yoga Pant ']");
    By size32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colourBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
By youAddedCronusYogaPantToYourShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");



    public void mouseHoverOnCronusYogaPant(){
        mouseHoverToElement(cronusYogaPant);
    }
    public void clickOnSize32(){
        mouseHoverToElementAndClick(size32);
    }
    public void clickOnColourBlack(){
        mouseHoverToElementAndClick(colourBlack);
    }
    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCart);
    }
    public String getYouAddedCronusYogaPantToYourShoppingCart(){
        return getTextFromElement(youAddedCronusYogaPantToYourShoppingCart);
    }
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart);
    }
}
