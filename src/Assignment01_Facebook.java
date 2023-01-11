import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Assignment01_Facebook {
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

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.findElement(By.className("fb_logo")).isDisplayed());

        System.out.println(driver.findElement(By.className("_8eso")).getText());

        System.out.println(driver.findElement(By.id("email")).isDisplayed());

        System.out.println(driver.findElement(By.id("pass")).isDisplayed());

        System.out.println(driver.findElement(By.xpath("//button[@name='login']")).getText());

        System.out.println(driver.findElement(By.xpath("//div[@class='_6ltj']")).getText());

        System.out.println(driver.findElement(By.cssSelector("a[id*='u_0_0_']")).getText());

        Driver.quitDriver();
    }
}
