package Pages;

import org.junit.jupiter.api.Test;

public class SeleniumForPageObject {
    HomePage homePage = new HomePage();
    DogsPage dogsPage = new DogsPage();

    @Test
    public void someDemoTest() {
        homePage.openBaseUrl();
        homePage.chooseCategory("dogs");
        dogsPage.fillMinMaxAge("10","101");
        dogsPage.fillMinMaxPrice("","1000000");
        dogsPage.pressSubmitButton();
        dogsPage.changeDealTypeTo("sell");
        homePage.stopDriver();
    }

}


