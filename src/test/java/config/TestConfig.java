package config;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static config.WebDriverSingleton.getInstance;
import static config.WebDriverSingleton.quit;

public class TestConfig {//it does this before and after each test

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        String baseUrl = "https://www.bialystokonline.pl/";

        driver = getInstance();//gets the driver instance
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait, which only works on the findElement method. If within 10s this method does not find the item on the page, it will throw NoElementFound. This wait is the same for every findElement method

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(baseUrl);//opens website
    }

    @AfterEach
    public void tearDown() {
        quit();
    }
}
