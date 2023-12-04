package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Jackets extends Utility {
    By sortBy = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By productName = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
By verifyTheProductsNameDisplayInAlphabeticalOrder = By.xpath("//strong[@class ='product name product-item-name']");

    By price = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By verifyTheProductsPriceDisplayInLowToHigh = By.xpath("//span[@class ='normal-price']//span[@class = 'price']");



    public void clickOnSortBy(){
        mouseHoverToElementAndClick(sortBy);
    }
    public void clickOnProductName(){
        selectByIndexFromDropDown(productName,1);

    }
    public String getVerifyTheProductsNameDisplayInAlphabeticalOrder(){
        return getTextFromElement(verifyTheProductsNameDisplayInAlphabeticalOrder);
    }

    public void clickOnPrice(){
        selectByIndexFromDropDown(productName,2);
    }
    public String getverifyTheProductsPriceDisplayInLowToHigh(){
        return  getTextFromElement(verifyTheProductsPriceDisplayInLowToHigh);
    }
}
