package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;

    public class NegativeLoginTest extends BasicTest {

        @Test
        void negativeLogin() {
            HomePage homePage = new HomePage(driver, wait);
            homePage.openPage();
            driver.findElement(By.xpath("//a[@class='login']")).click();
            String email = "negative-test-email@test";
            driver.findElement(By.id("email")).sendKeys(email);
            String password = "negativeTestEmail1!";
            driver.findElement(By.id("passwd")).sendKeys(password);
            driver.findElement(By.id("SubmitLogin")).click();
        }
    }

