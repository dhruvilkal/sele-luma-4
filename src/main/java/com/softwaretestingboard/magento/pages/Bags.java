package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Bags extends Utility {
    By overNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");



    public void clickOnOverNightDuffle(){
        mouseHoverToElementAndClick(overNightDuffle);
    }
}
