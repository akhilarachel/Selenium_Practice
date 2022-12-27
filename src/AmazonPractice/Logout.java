package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logout {
    public void Logout(WebDriver driver){
        //Logging out
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        action.moveToElement(driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"))).clickAndHold().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-item-signout']")));
        driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();
        Utility.captureScreenshot(driver);
    }
}
