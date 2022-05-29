package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase11 extends TestBase {

    @Test
    public void test11() throws InterruptedException {
        TestCaseData person = new TestCaseData();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePageVisible = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePageVisible.isDisplayed());
        //4. Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();
        //5. Scroll down to footer
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        //6. Verify text 'SUBSCRIPTION'
        WebElement subscriptionText = driver.findElement(By.xpath("//*[.='Subscription']"));
        Assert.assertTrue(subscriptionText.isDisplayed());
        //7. Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys(person.eMail + Keys.ENTER);
        driver.findElement(By.xpath("//button[@id='subscribe']")).click();
        Thread.sleep(10000);
        //8. Verify success message 'You have been successfully subscribed!' is visible
        WebElement successfulText = driver.findElement(By.xpath("//div[@class='alert-success alert']"));
        Assert.assertTrue(subscriptionText.isDisplayed());

    }
}
