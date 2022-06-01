package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class Logowanie extends BasePage{

    public Logowanie(){
        super();
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[2]/form/div[1]/div[1]/div[2]/input")
    private WebElement uzytkownikTextfield;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[2]/form/div[1]/div[2]/div[2]/input")
    private WebElement hasloTextfield;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[2]/form/div[2]/input[2]")
    private WebElement wyslijButton;

    @Step
    public Konto openKontoPage(){
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", uzytkownikTextfield);//scrolls to visible this WebElement
        uzytkownikTextfield.sendKeys("scream");
        js.executeScript("arguments[0].scrollIntoView();", hasloTextfield);
        hasloTextfield.sendKeys("mojehaslo");
        js.executeScript("arguments[0].scrollIntoView();", wyslijButton);
        wyslijButton.click();

        return new Konto();
    }

}
