package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestCase2 extends TestBase {


    @Test
    public void test02() {
        TestCaseData person = new TestCaseData();
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePageVisible = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        Assert.assertTrue(homePageVisible.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

        //5. Verify 'Login to your account' is visible
        WebElement loginToYourAccountText = driver.findElement(By.xpath("//h2[.='Login to your account']"));
        Assert.assertTrue(loginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password
        //7. Click 'login' button
        WebElement emailAdresse = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[1]"));
        Actions actions = new Actions(driver);
       actions.click(emailAdresse).sendKeys(person.eMail)
               .sendKeys(Keys.TAB)
               .sendKeys(person.password)
               .sendKeys(Keys.TAB)
               .sendKeys(Keys.ENTER).perform();

        //8. Verify that 'Logged in as username' is visible
        WebElement loggedUsernameText = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[9]/a"));
        Assert.assertTrue(loggedUsernameText.isDisplayed());

        //9. Click 'Delete Account' button
        driver.findElement(By.xpath("//a[@href='/delete_account']"));
        //10. Verify that 'ACCOUNT DELETED!' is visible
    }
}
