package Tests;

import WebsitePages.HomePage1;
import WebsitePages.ProductPage1;
import WebsitePages.RegistrationPage;
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
    @Test (priority = 1)
    void New_user() throws InterruptedException {
        HomePage1.click_on_menu();
        HomePage1.click_signInLink();
        SignInpage.click_newregistration_btn();
        RegistrationPage.sendkeys_Firstname_registration();
        RegistrationPage.sendkeys_Lastname_registration();
        RegistrationPage.sendkeys_Username_registration();
        RegistrationPage.sendkeys_Email_registration();
        RegistrationPage.sendkeys_Password_registration();
        RegistrationPage.click_submit_button();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    void SignIn_Test() throws InterruptedException {
    HomePage1.click_on_menu();
    HomePage1.click_on_home();
    HomePage1.click_on_menu();
    HomePage1.click_signInLink();
    SignInpage.sendkeys_username();
    SignInpage.sendkeys_password();
    SignInpage.click_Login_btn();
    ProductPage1.visibility_productCategory();
    Thread.sleep(3000);


    driver.close();
}
}
