package Lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCars {
    @Test
    public void cars() {
        String path = "C:\\Users\\Anna\\IdeaProjects\\SomeProjectGradle1\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/ru");
        driver.findElement(By.id("mtd_97")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        Select years = new Select((driver.findElement(By.id("f_o_18_min"))));
        years.selectByValue("2021");
        Select motors = new Select((driver.findElement(By.cssSelector("select[name = 'topt[15][max]']"))));
        motors.selectByValue("3.0");
        Select color = new Select((driver.findElement(By.cssSelector("select[name = 'opt[17]']"))));
        color.selectByValue("6318");
        driver.findElement(By.xpath("//input[@class='b s12']")).click();













    }
}