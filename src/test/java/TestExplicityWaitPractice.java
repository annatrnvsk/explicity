import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestExplicityWaitPractice extends BaseTest{

    @Test
    public void explicityWaitPractice(){
        // Arrange
        String blueButton = "edisplay-other-button";
        // Act
        ExplicityPage explicityPage = new ExplicityPage(driver);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicityPage.chooseBlueButton(blueButton);
//        wait.until(ExpectedConditions.stalenessOf(e);
        explicityPage.enabledButton.click();
        boolean result = explicityPage.enabledButton.isEnabled();
        // Assert
        Assertions.assertTrue(result);
    }


}
