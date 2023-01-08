import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

public class _06_Locators_linkText_partialLinkText {
    public static void main(String[] args) {
        /*
        TEST CASE:
        Go to https://techglobal-training.netlify.app/
        Select “Frontend Testing” from the “Practices” dropdown
        Select the “Locators” card
        Validate the “Red Apple”, “Green Apple” and “Pineapple” links and displayed, enabled
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontEndTesting();

        driver.findElement(By.id("card-1")).click();

        WebElement redApple = driver.findElement(By.linkText("Red Apple"));
        WebElement greenApple = driver.findElement(By.partialLinkText("Green"));
        WebElement pineApple = driver.findElement(By.partialLinkText("apple"));

        System.out.println(redApple.isDisplayed());
        System.out.println(redApple.isEnabled());
        System.out.println(redApple.getText());

        System.out.println(greenApple.isDisplayed());
        System.out.println(greenApple.isEnabled());
        System.out.println(greenApple.getText());

        System.out.println(pineApple.isDisplayed());
        System.out.println(pineApple.isEnabled());
        System.out.println(pineApple.getText());

        Driver.quitDriver();
    }
}
