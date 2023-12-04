package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.Pants;
import com.softwaretestingboard.magento.pages.ShoppingCart;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

HomePage homePage = new HomePage();
Pants pants = new Pants();
ShoppingCart shoppingCart =new ShoppingCart();



@Test
    public void userShouldAddProductSuccessfullyToShoppingCart() throws InterruptedException {
    Thread.sleep(2000);
    homePage.mouseHoverOnMenMenu();
    Thread.sleep(2000);
    homePage.mouseHoverOnBottoms();
    homePage.clickOnPants();
    pants.mouseHoverOnCronusYogaPant();
    pants.clickOnSize32();
    pants.clickOnColourBlack();
    pants.clickOnAddToCart();
    pants.getYouAddedCronusYogaPantToYourShoppingCart();
    pants.clickOnShoppingCart();
    shoppingCart.getVerifyTheTextShoppingCart();
    shoppingCart.getVerifyTextCronusYogaPant();
    shoppingCart.getVerifySize32();
    shoppingCart.getVerifyColourBlack();
}
}
