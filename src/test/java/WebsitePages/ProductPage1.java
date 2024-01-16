package WebsitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Tests.SeleniumDemo.driver;

public class ProductPage1 {
    public static String product_category_heading_xpath="//*[@id=\"ShoeType\"]";

    public static String visibility_productCategory(){


        String actualProductCategory= driver.findElement(By.xpath(product_category_heading_xpath)).getText();
        return actualProductCategory;
    }
}
