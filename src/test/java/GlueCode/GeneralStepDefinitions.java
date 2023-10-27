package GlueCode;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralStepDefinitions {
    public static WebDriver driver;

    @Given("I open {string} page")
    public void openPage(String page) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(page);
    }
}
