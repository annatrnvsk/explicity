import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver; //экземпляр класса - инициализируем (объявлем, что есть перенменная класса WebDriver)

    @BeforeEach
    public void setUp(){
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

    }

    @AfterEach
    public void setDown(){
        if(driver != null) {
            //driver.quit();
        }
    }

    public WebDriver getDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        return new ChromeDriver(options);
    }
}