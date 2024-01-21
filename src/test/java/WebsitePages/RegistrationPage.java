package WebsitePages;

import org.openqa.selenium.By;

import static Tests.SeleniumDemo.driver;

public class RegistrationPage {

    public static String Firstname_registration_id = "firstname";
    public static String Lastname_registration_id = "lastname";
    public static String Email_registration_id="emailId";
    public static String Username_registration_id="usr";
    public static String Password_registration_id="pwd";
    public static String Submit_button_xpath="//*[@id=\"first_form\"]/div/div[2]/center/input";

    public static void sendkeys_Firstname_registration()
    {
        driver.findElement(By.id(Firstname_registration_id)).sendKeys("Nihel");
    }
    public static void sendkeys_Lastname_registration()
    {
        driver.findElement(By.id(Lastname_registration_id)).sendKeys("Abdelkefi");
    }
    public static void sendkeys_Email_registration()
    {
        driver.findElement(By.id(Email_registration_id)).sendKeys("nihelab@test.com");
    }
    public static void sendkeys_Username_registration()
    {
        driver.findElement(By.id(Username_registration_id)).sendKeys("nihelab");
    }
    public static void sendkeys_Password_registration()
    {
        driver.findElement(By.id(Password_registration_id)).sendKeys("*******");
    }
    public static void click_submit_button()
    {
        driver.findElement(By.xpath(Submit_button_xpath)).click();
    }
}