package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase8 extends TestBase {

    @Test
    public void test08() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePageVisible = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePageVisible.isDisplayed());
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        String  allProductsText = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        String expectedText = "ALL PRODUCTS";
        Assert.assertTrue(allProductsText.contains(expectedText));
        //6. The products list is visible
        //7. Click on 'View Product' of first product
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
        //8. User is landed to product detail page
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement productName = driver.findElement(By.xpath("//*[.='Blue Top']"));
        WebElement category = driver.findElement(By.xpath("//p[.='Category: Women > Tops']"));
        WebElement price = driver.findElement(By.xpath("//span[.='Rs. 500']"));
     //   WebElement availability = driver.findElement(By.xpath("//b[.='Availability:']"));
       // WebElement condition = driver.findElement(By.xpath("//b[.='Availability:']"));
       // WebElement brand = driver.findElement(By.xpath("//b[.='Availability:']"));



    }
}
