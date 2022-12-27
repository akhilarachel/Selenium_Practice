package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ChangeLanguage {
    public void changeLanguage(WebDriver driver){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"))).click().perform();
        driver.findElement(By.xpath("//span[contains(text(),'- Translation')]")).click();
        //Utility.captureScreenshot(driver);
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
    }
}
