import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestExplicityWait extends BaseTest {

    @Test
    public void testExplicityWait0() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement alertButton = driver.findElement(By.xpath("//button[@id = 'alert']"));
        alertButton.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        Assertions.assertTrue(text.equals("I got opened after 5 secods"));
    }

    @Test
    public void testExplicityWait1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement changeButton = driver.findElement(By.xpath("//button[@id = 'populate-text']"));
        changeButton.click();
        WebElement inplaceText = driver.findElement(By.xpath("//h2[@class = 'target-text']"));
        wait.until(ExpectedConditions.textToBePresentInElement(inplaceText, "Selenium Webdriver"));
        Assertions.assertTrue(inplaceText.isDisplayed());
    }

    @Test
    public void testExplicityWait2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement displayButton = driver.findElement(By.xpath("//button[@id = 'display-other-button']"));
        displayButton.click();
        WebElement enabledButton = driver.findElement(By.xpath("//button[@id = 'hidden']"));
        wait.until(ExpectedConditions.visibilityOf(enabledButton));
        Assertions.assertTrue(enabledButton.isDisplayed());
    }

       @Test
    public void testExplicityWait3() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enableButton = driver.findElement(By.xpath("//button[@id = 'enable-button']"));
        enableButton.click();
        WebElement activeButton = driver.findElement(By.xpath("//button[@id = 'disable']"));
        wait.until(ExpectedConditions.elementToBeClickable(activeButton));
        Assertions.assertTrue(activeButton.isEnabled());
    }

    @Test
    public void testExplicityWait4() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkButton = driver.findElement(By.xpath("//button[@id = 'checkbox']"));
        checkButton.click();
        WebElement visibleButton = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(visibleButton));
        Assertions.assertTrue(visibleButton.isSelected());
    }

}