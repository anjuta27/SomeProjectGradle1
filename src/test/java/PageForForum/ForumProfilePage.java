package PageForForum;


import org.openqa.selenium.By;

public class ForumProfilePage extends ForumBasePage {


    private final By goToChangeMyData = By.xpath("//a[@class='margin-bottom-quarter inline-block']");
    private final By firstName = By.id("inputFirstName");
    private final By secondName = By.id("inputLastName");
    private final By cityIn = By.id("inputCity");
    private final By apstiprinatButton = By.xpath("//button[@class='btn btn-primary']");



    public void clickChangeMyData() {
        driver.findElement(goToChangeMyData).click();
    }

    public void inputNames(String fName, String sName) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(secondName).clear();
        driver.findElement(secondName).sendKeys(sName);
    }

    public void inputCity(String city) {
        driver.findElement(cityIn).clear();
        driver.findElement(cityIn).sendKeys(city);
    }

    public void pressApstiprinatButton() {
        driver.findElement(apstiprinatButton).submit();
    }

}


