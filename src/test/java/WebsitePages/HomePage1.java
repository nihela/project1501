package WebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Tests.SeleniumDemo.driver;


public class HomePage1 {
    public static String Menu="//*[@id=\"menuToggle\"]/input";
    public static String SignIn_Link="//*[@id=\"menu\"]/a[2]/li";
    public static String Home="//*[@id=\"menu\"]/a/li";
    public static void click_on_menu() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(Menu)).click();
    }
    public static void click_signInLink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(SignIn_Link)).click();
    }
    public static void click_on_home() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath(Home)).click();
    }

}
