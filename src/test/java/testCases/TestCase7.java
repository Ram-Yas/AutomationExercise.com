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
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
        //5. Verify user is navigated to test cases page successfully
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "test_cases";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
}
