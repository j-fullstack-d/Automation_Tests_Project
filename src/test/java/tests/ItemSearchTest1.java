package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.SearchResultPage;

public class ItemSearchTest1 extends BasicTest {

    @Test
    void shouldReturnCorrectProductListWhenPositiveSearchPhraseIsUsed() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.openPage();
        homePage.searchForProduct("hat");

        SearchResultPage searchResultPage = new SearchResultPage(driver, wait);
        Assertions.assertTrue(searchResultPage.isProductWithNameVisible("hat"));
        Assertions.assertEquals("7 results have been found.", searchResultPage.getSearchSummary());
    }

}
