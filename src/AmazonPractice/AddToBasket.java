package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasket {
    public void AddToBasket(WebDriver driver){
        //Adding product to basket
        driver.findElement(By.name("submit.add-to-cart")).click();
        Utility.captureScreenshot(driver);
    }
}
