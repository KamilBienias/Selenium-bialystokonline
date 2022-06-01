package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class Home extends BasePage {

    public Home() {
        super();
    }

    @FindBy(xpath = "//a[@title='Twój Profil']")
    private WebElement logowanieLink;

    @Step
    public Logowanie openLogowaniePage() {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", logowanieLink);//scrolls to visible this WebElement
        logowanieLink.click();

        return new Logowanie();//returns a new class, which in new website
    }
}
