package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By verifyTheTextShoppingCart = By.xpath("//span[@class='base']");
    By verifyTextCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifySize32 = By.xpath("//dd[contains(text(),'32')]");
    By verifyColourBlack = By.xpath("//dd[contains(text(),'Black')]");



    public String getVerifyTheTextShoppingCart(){
        return getTextFromElement(verifyTheTextShoppingCart);
    }
    public String getVerifyTextCronusYogaPant(){
        return getTextFromElement(verifyTextCronusYogaPant);

    }
    public String getVerifySize32(){
        return getTextFromElement(verifySize32);
    }
    public String getVerifyColourBlack(){
        return getTextFromElement(verifyColourBlack);

    }
}
