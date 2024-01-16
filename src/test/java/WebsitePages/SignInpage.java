package WebsitePages;

import org.openqa.selenium.By;

import static Tests.SeleniumDemo.driver;

public class SignInpage {
    public static String username_text_xpath="usr";
    public static String password_text_xpath="pwd";
    public static String login_btn_xpath="//*[@id=\"second_form\"]/input";
    public static String registration_btn_xpath="NewRegistration";

    public static void sendkeys_username()
    {
        driver.findElement(By.id(username_text_xpath)).sendKeys("sa");
    }
    public static void sendkeys_password()
    {
        driver.findElement(By.id(password_text_xpath)).sendKeys("sa");
    }

    public static void click_Login_btn()
    {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
    public static void click_newregistration_btn()
    {
        driver.findElement(By.id(registration_btn_xpath)).click();
    }
}
