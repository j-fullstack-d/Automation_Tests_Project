package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.SearchResultPage;

    public class ItemSearchTest2 extends BasicTest {

        @Test
        void shouldReturnCorrectProductListWhenPositiveSearchPhraseIsUsed2() {
            HomePage homePage = new HomePage(driver, wait);
            homePage.openPage();
            homePage.searchForProduct("dress");

            SearchResultPage searchResultPage = new SearchResultPage(driver, wait);
            Assertions.assertTrue(searchResultPage.isProductWithNameVisible("dress"));
            Assertions.assertEquals("7 results have been found.", searchResultPage.getSearchSummary());
        }
    }

