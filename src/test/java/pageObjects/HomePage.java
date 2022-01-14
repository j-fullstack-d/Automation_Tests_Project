package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasicPage {

    public HomePage(WebDriver driverIn, WebDriverWait waitIn){
        super(driverIn, waitIn);
    }

    public void openPage(){
        driver.get(BASE_URL + "index.php");
    }

}
