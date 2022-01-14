package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.RandomUser;

public class RegisterAccountPage extends BasicPage {

    @FindBy(id = "customer_firstname")
    WebElement customerFirstname;

    @FindBy(id = "customer_lastname")
    WebElement customerLastname;

    public RegisterAccountPage(WebDriver driverIn, WebDriverWait waitIn) {
        super(driverIn, waitIn);
    }

    public void registerUser(RandomUser user) {
        customerFirstname.sendKeys(user.firstName);
        customerLastname.sendKeys(user.lastName);
    }
}
