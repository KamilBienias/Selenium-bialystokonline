package tests;

import config.TestConfig;

import org.junit.jupiter.api.Test;
import pages.Home;

public class WebsiteTest extends TestConfig {

    @Test
    public void userShouldLogin() {
        new Home()
                .openLogowaniePage()
                .openKontoPage()
                .checkUserName();
    }
}