package Tests;

import Pages.Home;
import Pages.ProductsPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static WebDriver driver;
    static ExtentReports reports;
    static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark/html");
        extent.attachReporter(spark);
        Home.click_hamburger();
        Home.click_orderproductLinks();
    }

    @Test
   void ValidateTitles_onlineProducts() throws InterruptedException {
            test = extent.createTest("Validate Titles on Products", "this is validate on diffrent show types ");
            ProductsPage.formal_verifyTitle();
            ProductsPage.sport_shoe_verifyTitile();
            ProductsPage.sneakers_verifyTitile();
            extent.flush();
        }

        @Test
    void ValidateFirstFormalShoes() throws InterruptedException {
            test = extent.createTest("Validate first formal shoes", "this is validate on first formal shoe product");
            ProductsPage.FormalFirstshoeVerification();
        }

        @Test
    void ValidatefirstSportShoe(){
            test = extent.createTest("Validate first sport shoes", "this is validate on first sport shoe product");
            ProductsPage.sportFirstshoeVerification();
        }

        @AfterSuite
        public static void cleanup(){
        extent.flush();
        }
    }



