import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActions {
    WebDriver driver;

    @Test
    public void navigateToGoogle() {
        driver = new ChromeDriver();
        maximize();
        navigateTo("https://google.com");
        navigateTo("https://bing.com");
        navigateBack();
        navigateForward();
        refreshPage();
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

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void minimize() {
        driver.manage().window().minimize();
    }
}