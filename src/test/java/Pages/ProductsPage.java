package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;

public class ProductsPage {

    public static String formal_title_xpath ="//h2[text()='Formal Shoes']";
    public static String sport_title_xpath ="//h2[text()='Sports Shoes']";
    public static String sneakers_title ="//h2[text()='Sneakers']";

    public static String formal_drop_xpath ="/html/body/div[2]/center/div/i[1]";
    public static String sport_drop_xpath ="//i[@class='fa fa-angle-double-down sportsshoedropdown']";
    public static String sneakers_drop ="//i[@class='fa fa-angle-double-down sneakershoedropdown']";
    public static String formal_first= "/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]";
    public static String Sport_First="//td[contains(text(),' Ultimate')]";


    public static void formal_verifyTitle(){
        String expectedTitleFS = "Formal Shoes";
        String actualTextFS =  driver.findElement(By.xpath(formal_title_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTextFS);

    }
    public static void sport_shoe_verifyTitile(){
        String expectedTitleSp = "Sports Shoes";
        String actualTextSp =  driver.findElement(By.xpath(sport_title_xpath)).getText();
        Assert.assertEquals(expectedTitleSp, actualTextSp);
    }
    public static void sneakers_verifyTitile(){
        String expectedTitleS = "Sneakers";
        String actualTextS =  driver.findElement(By.xpath(sneakers_title)).getText();
        Assert.assertEquals(expectedTitleS, actualTextS);
    }

    public static void FormalFirstshoeVerification() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(formal_drop_xpath)).click();
        String ExpectedTextff = "   Classic Cheltenham";
        String ActualTextff= driver.findElement(By.xpath(formal_first)).getText();
        Assert.assertEquals(ExpectedTextff,ActualTextff);
    }
    public static void sportFirstshoeVerification(){
        driver.findElement(By.xpath(sport_drop_xpath)).click();
        String ExpectedTextss = "   Ultimate";
        String ActualTextss= driver.findElement(By.xpath(Sport_First)).getText();
        Assert.assertEquals(ExpectedTextss, ActualTextss);
    }


    public static void sneakers_dropdown(){

    }


}
