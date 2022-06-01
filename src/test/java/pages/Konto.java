package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;
import static utility.Screenshot.captureScreenshot;


public class Konto extends BasePage {

    public Konto(){
        super();
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[2]/span/b")
    private WebElement userName;

    @Step
    public void checkUserName(){
        captureScreenshot();
        String expectedUserNameText = "scream";
        String userNameText = userName.getText();
        Assertions.assertEquals(userNameText, expectedUserNameText);
    }
}
