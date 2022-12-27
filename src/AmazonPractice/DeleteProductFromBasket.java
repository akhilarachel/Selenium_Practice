package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteProductFromBasket {
    public void DeleteProductFromBasket(WebDriver driver){
        //Deleting the product from cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='a-page']/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/div[1]/span[2]/span[1]/input[1]")));
        driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/div[1]/span[2]/span[1]/input[1]")).click();
        Utility.captureScreenshot(driver);
    }
}
