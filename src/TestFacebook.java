import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestFacebook {
    public static void main(String[] args) {
        /*
        TEST CASE:
         Go to https://www.facebook.com/
         Validate the title of the page is “Facebook - log in or sign up”
         Validate the URL of the page is “https://www.facebook.com/”
         Validate “facebook” logo is displayed
         Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
         Validate “Email or Phone Number” input box is displayed
         Validate “Password” input box is displayed
         Validate “Log In” button is displayed and enabled
         Validate “Forgot Password?” link is displayed
         Validate “Create New Account” button is displayed (Done but used full xpath code, couldn't figure out other way)
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com");

        if(driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if(driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

        if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        WebElement secondHeader = driver.findElement(By.xpath("//h2"));

        if(secondHeader.isDisplayed()) System.out.println("Heading2 validation PASSED");
        else System.out.println("Heading2 validation FAILED");

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']"));

        if(emailInputBox.isDisplayed()) System.out.println("Email or Phone Number input box PASSED");
        else System.out.println("Email or Phone Number input box FAILED");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));

        if(passwordBox.isDisplayed()) System.out.println("Password box PASSED");
        else System.out.println("Password box FAILED");

        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

        if(loginButton.isDisplayed() && loginButton.isEnabled()) System.out.println("Login button PASSES");
        else System.out.println("Login button FAILED");

        WebElement forgotPassword = driver.findElement(By.xpath("//div[@class='_6ltj']"));

        if(forgotPassword.isDisplayed()) System.out.println("Forgot Password displayed PASSES");
        else System.out.println("Forgot Password displayed FAILED");

        WebElement createNew = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));

        if(createNew.isDisplayed()) System.out.println("Create New Account button displayed PASSES");
        else System.out.println("Create New Account button displayed FAILED");

        Driver.quitDriver();
    }
}
