package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewBasket {
    public void ViewBasket(WebDriver driver){
        //Go to basket
        driver.findElement(By.xpath("//span[@id='sw-gtc']")).click();
        Utility.captureScreenshot(driver);
    }
}
