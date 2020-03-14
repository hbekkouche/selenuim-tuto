package hoo.selenuim.tuto;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@ExtendWith(SeleniumExtension.class)
class SeleniumTest {

    @Test
    void projectIsConfigured(ChromeDriver driver) {
        driver.get("https://www.google.com");
        Assertions.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test
    void projectIsConfigured(FirefoxDriver driver) {
        driver.get("https://www.google.com");
        Assertions.assertTrue(driver.getTitle().contains("Google"));
    }
}