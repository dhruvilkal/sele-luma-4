package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Bags;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDuffle;
import com.softwaretestingboard.magento.pages.ShoppingCart2;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
HomePage homePage = new HomePage();
Bags bags =new Bags();
OverNightDuffle overNightDuffle = new OverNightDuffle();
ShoppingCart2 shoppingCart2 = new ShoppingCart2();



@Test
    public void userShouldAddProductSuccessfullyToShoppingCart() throws InterruptedException {
    Thread.sleep(2000);
    homePage.mouseHoverOnGearMenu();
    Thread.sleep(2000);
    homePage.clickOnBags();
    bags.clickOnOverNightDuffle();
    overNightDuffle.getVerifyTextOverNightDuffle();
    //chang quantity
    overNightDuffle.clickOnBox();
    Thread.sleep(2000);
    overNightDuffle.clearQuantityBox();
    overNightDuffle.addInBox("3");

    overNightDuffle.addToCartButton();

    overNightDuffle.getVerifyTextYouAddedOverNightDuffleToYourShoppingCart();
overNightDuffle.clickOnShoppingCart();

shoppingCart2.getVerifyText$135();

    shoppingCart2.getVerifyTextQty3();
shoppingCart2.getVerifyTextOverNightDuffle();

shoppingCart2.clickOnQtyBox();
Thread.sleep(2000);
shoppingCart2.clearQtyBox();

shoppingCart2.addQtyInBox("5");

shoppingCart2.clickOnUpdateShoppingCart();
shoppingCart2.getVerifyText$225();



}
}
