package config;

import io.github.bonigarcia.wdm.WebDriverManager; //automatic chromedriver loading
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;
    private WebDriverSingleton() {}

    public static WebDriver getInstance() {
        if (null == driver) {//if the browser is not open

            //automatic chromedriver loading
//            WebDriverManager.chromedriver().setup();

//            chromedriver version 102, not included on github
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");



            driver = new ChromeDriver();//opens browser
        }
        return driver;
    }

    public static void quit() {
        if(null != driver) {
            driver.quit();
        }
        driver = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
