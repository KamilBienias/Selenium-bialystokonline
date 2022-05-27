package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.WebDriverSingleton.getInstance;
import static utility.Actions.waitForVisibilityOfElement;

public class BasePage {//this class is extended by other pages in the pages package

    public BasePage() {
        //this initializes the elements in a given page, so as not to enter in every constructor. This is the page class in which the elements are to be loaded, i.e. points to the context.
        PageFactory.initElements(getInstance(), this);

        //to click until the whole page loads. Waits for a common element for each page and then can click. Such element is id = "container"
        waitForVisibilityOfElement(pageContent);
    }

    @FindBy(tagName = "body")
    private WebElement pageContent;
}
