import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActions {
    WebDriver driver;

    @Test
    public void navigateToGoogle() {
        driver = new ChromeDriver();
        navigateTo("https://google.com");
        navigateTo("https://bing.com");
        navigateBack();
        navigateForward();
    }

    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }
}