package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HomePage;

public class RegisterAccountTest2 extends BasicTest {

        @Test
        void register() {
            HomePage homePage = new HomePage(driver, wait);
            homePage.openPage();
            driver.findElement(By.xpath("//a[@class='login']")).click();
            Faker faker = new Faker();
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String email = firstName + lastName + faker.random().nextInt(99) + "@gmail.com";
            driver.findElement(By.id("email_create")).sendKeys(email);
            driver.findElement(By.id("SubmitCreate")).click();
            driver.findElement(By.id("customer_firstname")).sendKeys(firstName);
            driver.findElement(By.id("customer_lastname")).sendKeys(lastName);
            driver.findElement(By.id("passwd")).sendKeys("passwd123");
            Select day = new Select(driver.findElement(By.id("days")));
            Select month = new Select(driver.findElement(By.id("months")));
            Select year = new Select(driver.findElement(By.id("years")));
            day.selectByValue("10");
            month.selectByValue("5");
            year.selectByValue("2000");
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys(firstName);
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys(lastName);
            driver.findElement(By.id("address1")).sendKeys("warsaw");
            driver.findElement(By.id("city")).sendKeys("warsaw");
            Select state = new Select(driver.findElement(By.id("id_state")));
            state.selectByValue("1");
            driver.findElement(By.id("postcode")).sendKeys("01234");
            driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
            driver.findElement(By.id("submitAccount")).click();
            Assertions.assertEquals("MY ACCOUNT", driver.findElement(By.xpath("//h1[text()='My account']")).getText());
        }
    }

