package Lecture7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAliexpress {
    @Test
    public void aliexpress() {
        String path = "C:\\Users\\Anna\\IdeaProjects\\SomeProjectGradle1\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");


        driver.findElement(By.cssSelector("img[class = '_24EHh'")).click();
        driver.findElement(By.cssSelector("button[class='btn-accept'")).click();
        driver.findElement(By.cssSelector("img[src='https://img.alicdn.com/tfs/TB1a.Oge_M11u4jSZPxXXahcXXa-48-48.png'")).click();
        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        driver.findElement(By.cssSelector("input[class = 'search-button'")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@class='ui-button narrow-go']")).click();
        driver.quit();

    }



    }

