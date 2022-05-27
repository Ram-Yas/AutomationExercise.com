package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase9 extends TestBase {

    @Test
    public void test09() {

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
        //6. Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("men"+ Keys.ENTER);
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        //7. Verify 'SEARCHED PRODUCTS' is visible
        WebElement searchedProductText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(searchedProductText.isEnabled());
        //8. Verify all the products related to search are visible

    }
}
