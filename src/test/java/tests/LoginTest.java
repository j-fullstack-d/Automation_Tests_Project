package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;

    public class LoginTest extends BasicTest {

        @Test
        void login() {
            HomePage homePage = new HomePage(driver, wait);
            homePage.openPage();
            driver.findElement(By.xpath("//a[@class='login']")).click();
            String email = "test-email@testemail.com";
            driver.findElement(By.id("email")).sendKeys(email);
            String password = "testEmail1!";
            driver.findElement(By.id("passwd")).sendKeys(password);
            driver.findElement(By.id("SubmitLogin")).click();
        }
    }