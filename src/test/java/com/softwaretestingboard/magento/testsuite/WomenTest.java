package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.Jackets;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
HomePage homePage = new HomePage();
Jackets jackets = new Jackets();





    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTops();

        homePage.clickOnJackets();
        jackets.clickOnSortBy();
        jackets.clickOnProductName();
        jackets.getVerifyTheProductsNameDisplayInAlphabeticalOrder();

    }
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTops();

        homePage.clickOnJackets();
        jackets.clickOnPrice();
        jackets.getverifyTheProductsPriceDisplayInLowToHigh();

    }

}
