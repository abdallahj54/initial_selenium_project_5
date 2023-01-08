import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {

        /*
        Test Case:
        Go to https://techglobal-training.netlify.app/
        Validate the company logo is displayed
         */

        System.setProperty("webdriver.chrome.driver", "/Users/abdallahjaber/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techglobal-training.netlify.app/");
        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.id("logo")); // locating the logo by its id

        if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        driver.quit();
    }
}
