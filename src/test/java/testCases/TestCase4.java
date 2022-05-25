package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase4 extends TestBase {
   /* 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
            3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Logout' button
10. Verify that user is navigated to login page*/

    @Test
    public void ornek04() {

        driver.get("http://automationexercise.com");


        WebElement sayfa= driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(sayfa.isDisplayed());

        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

        WebElement login=driver.findElement(By.xpath("//*[text()='Login to your account']"));
        Assert.assertTrue(login.isDisplayed());

        WebElement email=driver.findElement(By.xpath("//input[@data-qa=\"login-email\" ]"));
        email.sendKeys("muberraturquia1@gmail.com");

        WebElement password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\" ]"));
        password.sendKeys("12345md");
        driver.findElement(By.xpath("//button[@data-qa=\"login-button\" ]")).click();

        WebElement login2=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[9]/a"));
        Assert.assertTrue(login2.isDisplayed());

        driver.findElement(By.xpath("//a[@href='/logout']")).click();

        String loginYazisi=driver.getCurrentUrl();
        String expectedYazi= "login";
        Assert.assertTrue(loginYazisi.contains(expectedYazi));

    }
}