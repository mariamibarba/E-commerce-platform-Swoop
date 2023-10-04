import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class ConfigTest {
    WebDriver driver;
    @BeforeSuite
    public void configTests() {
        Configuration.browserSize="2000x1800";
        Configuration.savePageSource =false;
        Configuration.holdBrowserOpen=false;
        Configuration.reopenBrowserOnFail = true;
        Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.timeout=10000;
        Configuration.browser = "chrome";
        Configuration.screenshots = true;

    }

    @BeforeMethod(alwaysRun = true)
    @Story("Opening url for all tests")
    @Description("Maximize browsers windows")
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        open("https://swoop.ge");
        Configuration.assertionMode = AssertionMode.SOFT;


    }


    @AfterMethod
    @Description("Quits browser")
    public void tearDown() {
        driver.quit();
    }
}