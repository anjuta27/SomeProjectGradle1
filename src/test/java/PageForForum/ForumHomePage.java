package PageForForum;

import org.openqa.selenium.By;

public class ForumHomePage extends ForumBasePage {

    private final By toLoginPage = By.xpath("//div[@class='navbar-formOrNav navbar-right navbar-login']");
    private final By toProfilePage = By.xpath("//a[@class='navbar-link']");

    public void openLoginPage() {
        driver.findElement(toLoginPage).click();


    }

    public void openProfilePage() {
        driver.findElement(toProfilePage).click();
        }

    }



