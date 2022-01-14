package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterAccountPage;
import utils.RandomUser;

    public class RegisterAccountTest1 extends BasicTest {

        @Test
        void shouldRegisterNewUserWhenAllMandatoryDataIsProvided(){

            HomePage homePage = new HomePage(driver, wait);
            homePage.openPage();

            driver.findElement(By.xpath("//a[@class='login']")).click();

            RandomUser user = new RandomUser();
            System.out.println(user);

            LoginPage loginPage = new LoginPage(driver, wait);
            loginPage.goToRegisterForm(user.email);

            RegisterAccountPage registerAccountPage = new RegisterAccountPage(driver,wait);
            registerAccountPage.registerUser(user);
        }
    }
