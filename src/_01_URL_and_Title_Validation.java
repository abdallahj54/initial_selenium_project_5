import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {
        /*
        TEST CASE:
        Go to https://www.techglobalschool.com
        Get current url and validate it
        Get title and validate it

        EXPECTED RESULT:
        URL  = https://www.techglobalschool.com/
        Title = SDET Bootcamp | TechGlobal
         */

        // 1. Set Up
        System.setProperty("webdriver.chrome.driver","/Users/abdallahjaber/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 2. Test Validation
        driver.get("https://www.techglobalschool.com/"); // no cache
        //driver.navigate().to("https://www.techglobalschool.com/"); // keep cache

        if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if(driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        // 3. Teardown
        Thread.sleep(2000); // Prior to closing it will wait 2 seconds once URL fully opened
        driver.quit();
    }
}
