package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

    public class BasicTest {

        static WebDriver driver;
        static WebDriverWait wait;

        @BeforeAll
        static void setUp(){
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 5);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }

        @BeforeEach
        void clearCookies(){
            driver.manage().deleteAllCookies();
        }

        @AfterAll
        static void tearDown(){
            driver.quit(); // close all browser tabs/widows and webdriver
        }
    }
