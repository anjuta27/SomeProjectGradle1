package Lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
@Test
    public void someDemo(){
    String path = "C:\\Users\\Anna\\IdeaProjects\\SomeProjectGradle1\\src\\test\\resources\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver" ,path);
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.ss.com/ru");
    driver.findElement(By.id("mtd_300")).click();
    Select dealType = new Select((driver.findElement(By.cssSelector("select[name = 'sid']"))));
    dealType.selectByValue("/ru/animals/dogs/sell/");
    driver.findElement(By.id("f_o_8_min")).sendKeys("20");
    driver.findElement(By.id("f_o_1276_max")).sendKeys("5");
    driver.findElement(By.xpath("//input[@class='b s12']")).click();
}
}
