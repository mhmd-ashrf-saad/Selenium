import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActions {
    WebDriver driver;

    @Test
    public void navigateToGoogle() {
        driver = new ChromeDriver();
        driver.get("https://www.Google.com/");
    }
}