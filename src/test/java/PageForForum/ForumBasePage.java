package PageForForum;

import org.openqa.selenium.chrome.ChromeDriver;

public class ForumBasePage {
    public static ChromeDriver driver;


    public void openChrome(String url) {
        String path = "C:\\Users\\Anna\\IdeaProjects\\SomeProjectGradle1\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
        public void closeChrome() {
            driver.quit();
        }

    }

