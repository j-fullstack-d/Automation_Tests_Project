package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasicPage {

    @FindBy(id = "search_query_top")
    WebElement searchBox;

    @FindBy(css = ".menu-content>li>a")
    List<WebElement> productCategories;

    @FindBy(css = ".shopping_cart .ajax_cart_quantity")
    WebElement cartQuantity;

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected static final String BASE_URL = "http://automationpractice.com/";

    public BasicPage(WebDriver driverIn, WebDriverWait waitIn) {
        this.driver = driverIn;
        this.wait = waitIn;
        PageFactory.initElements(driver, this);
    }

    public void searchForProduct(String productName) {
        searchBox.sendKeys("hat");
        searchBox.sendKeys(Keys.ENTER);
    }

    public void goToProductCategoryByIndex(int productCategoryIndex) {
        productCategories.get(productCategoryIndex).click();
    }

    public int getCartSize() {
        String cartQuantityText = cartQuantity.getText();
        return Integer.parseInt(cartQuantityText);
    }
}
