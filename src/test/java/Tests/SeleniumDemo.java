package Tests;

import WebsitePages.HomePage1;
import WebsitePages.ProductPage1;
import WebsitePages.SignInpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumDemo {
    public static WebDriver driver;
    @BeforeTest
        public static void Setup(){
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
    }
    @Test
    void ValidateTitles_OnlineProduct() throws InterruptedException {
    HomePage1.click_on_menu();
    HomePage1.click_signInLink();
    SignInpage.sendkeys_username();
    SignInpage.sendkeys_password();
    SignInpage.click_Login_btn();

}

}
