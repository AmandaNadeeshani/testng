package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class Home {
    public static String hamburger_menu_xpth="//input[@type='checkbox']";
    public static String onlineProducts_xpath="//li[text()='Online Products']";

    public static void click_hamburger(){
        driver.findElement(By.xpath(hamburger_menu_xpth)).click();
    }

    public static void click_orderproductLinks() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(onlineProducts_xpath)).click();
    }
}
