package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase7 extends TestBase {

    @Test
    public void test07() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePageVisible = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePageVisible.isDisplayed());
        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        //5. Verify user is navigated to test cases page successfully
        String actualTitle = driver.getTitle();
        String expectedTitle = "test cases";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
