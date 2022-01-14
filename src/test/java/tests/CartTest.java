package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.ProductsPage;
import pageObjects.HomePage;

    public class CartTest extends BasicTest {

        @Test
        void shouldBeAbleToAddProductToTheCart() {
            ProductsPage productsPage = goToProductCategoryPage(0);
            productsPage.addRandomProductToCart();
            Assertions.assertEquals(1, productsPage.getCartSize());
        }

        @Test
        void shouldBeAbleToAddMultipleProductsToTheCart() {
            ProductsPage productsPage = goToProductCategoryPage(1);
            productsPage.addRandomProductToCart();
            productsPage.addRandomProductToCart();
            Assertions.assertEquals(2, productsPage.getCartSize());
        }

        private ProductsPage goToProductCategoryPage(int i) {
            HomePage homePage = new HomePage(driver, wait);
            homePage.openPage();
            homePage.goToProductCategoryByIndex(0);
            ProductsPage productsPage = new ProductsPage(driver, wait);
            return productsPage;
        }
    }

