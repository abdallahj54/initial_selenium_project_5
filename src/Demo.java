import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/abdallahjaber/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver(); // Instantiating ChromeDriver
        driver.get("https://www.google.com/"); // Navigate to our URL

        driver.manage().window().fullscreen(); // Opens our URL in FullScreen

        driver.quit(); // Quit the driver instance
    }
}
