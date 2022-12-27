package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
    public void Login(WebDriver driver){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).click().perform();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("kramerzoe90@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("@Zoekramer90");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        Utility.captureScreenshot(driver);
    }
}
