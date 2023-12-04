package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart2 extends Utility {
    By verifyTextQty3 = By.xpath("//input[@id='cart-484598-qty']");
    By verifyTextOverNightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyText$135 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    // clickonbox
    By clickOnQtyBox = By.xpath("//input[@id='cart-484598-qty']");

    // clearBox
    By clearQtyBox = By.xpath("//input[@id='cart-484598-qty']");
    //send text
    By addQtyInBox = By.xpath("//input[@id='cart-484598-qty']");

    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    By verifyText$225 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");





    public String getVerifyTextQty3(){
      return   getTextFromElement(verifyTextQty3);
    }
    public String getVerifyTextOverNightDuffle(){
        return getTextFromElement(verifyTextOverNightDuffle);
    }
    public String getVerifyText$135(){
        return getTextFromElement(verifyText$135);
    }
    public void clickOnQtyBox(){
        mouseHoverToElementAndClick(clickOnQtyBox);
    }
    public void clearQtyBox(){
        clearInput(clearQtyBox);
    }
    public void addQtyInBox(String Quantity){
        sendTextToElement(addQtyInBox,Quantity);

    }
    public void clickOnUpdateShoppingCart(){
        mouseHoverToElementAndClick(updateShoppingCart);
    }
    public String getVerifyText$225(){
        return getTextFromElement(verifyText$225);
    }

}
