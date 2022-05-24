package testCases;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase3 extends TestBase {




    @Test
    public void test1() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        //5. Verify 'Login to your account' is visible
        WebElement loginText = driver.findElement(By.xpath("//*[text()='Login to your account']"));
        Assert.assertTrue(loginText.isDisplayed());
        //6. Enter incorrect email address and password
        driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("veli@can.com");
        driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("123456fr");
        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        WebElement incorrectText = driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
        Assert.assertTrue(incorrectText.isDisplayed());


    }
}
