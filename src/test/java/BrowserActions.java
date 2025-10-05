import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActions {
    WebDriver driver;

    @Test
    public void navigateToGoogle() {
        driver = new ChromeDriver();
        maximize();
        navigateTo("https://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB);

        closeCurrentTab();
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

    public void setSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public void fullscreen() {
        driver.manage().window().fullscreen();
    }

    public void getCurrentUrl() {
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    public void getTitle() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

    public void getPageSource() {
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: " + pageSource);
    }

    public void getWindowHandle() {
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Handle: " + windowHandle);
    }

    public void closeCurrentTab() {
        driver.close();
    }
}