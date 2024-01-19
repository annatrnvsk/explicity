import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExplicityPage {

    //Элементы
    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary')]")
    List<WebElement> blueButton;

    @FindBy(xpath = "//button[@id = 'hidden']")
    List<WebElement> resultButton;

    // Конструктор
    public ExplicityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Методы
    public void chooseBlueButton(String value) {
        for (WebElement webElement : blueButton) {
            if (webElement.getAttribute("id").contains(value)) {
                webElement.click();
                break;
            }
        }
    }
}