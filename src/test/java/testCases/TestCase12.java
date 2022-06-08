package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase12 extends TestBase {


    @Test
    public void test12() {
        TestCaseData person = new TestCaseData();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePageVisible = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePageVisible.isDisplayed());
        //4. Click 'Products' button
        driver.findElement(By.xpath("(//a[@href='/products'])[1]")).click();
        //5. Hover over first product and click 'Add to cart'
        Actions actions = new Actions(driver);
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='productinfo text-center'])[1]"));
        WebElement firstProductText = driver.findElement(By.xpath("(//*[.='Blue Top'])[1]"));
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(firstProduct).perform();
        WebElement addToChart = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));
        addToChart.click();
        //   actions.moveToElement(firstProduct).click();
        //6. Click 'Continue Shopping' button
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
        //7. Hover over second product and click 'Add to cart'
        //WebElement secondProduct = driver.findElement(By.xpath("(//div[@class='productinfo text-center'])[2]"));
        //actions.moveToElement(secondProduct).perform();
        WebElement addToChart2 = driver.findElement(By.xpath("(//a[@data-product-id='2'])[1]"));
        addToChart2.click();
        //8. Click 'View Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();


        //9. Verify both products are added to Cart
        Assert.assertTrue(firstProductText.isDisplayed());
        //10. Verify their prices, quantity and total price
    }
}
