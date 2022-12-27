package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BuyProduct {
    public void buyFirestick(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-hamburger-menu']")));
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Utility.captureScreenshot(driver);

        //Going to sublevel menu
        List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible']//li/a"));
        for (int i = 0; i < menuList.size(); i++) {
            //System.out.println(menuList.get(i).getAttribute("innerHTML"));
            String iHTML = menuList.get(i).getAttribute("innerHTML");
            if (iHTML.contains("Prime Video")) {
                menuList.get(i).click();
                break;
            }
        }
        Utility.captureScreenshot(driver);

        //Going to further sublevel menu
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> subMenuListPV = driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']//li"));
        for (int i = 0; i < menuList.size(); i++) {
            String iHTMLPV = subMenuListPV.get(i).getAttribute("innerHTML");
            if (iHTMLPV.contains("Watch Anywhere")) {
                subMenuListPV.get(i).click();
                break;
            }
        }
        Utility.captureScreenshot(driver);

        //Checking today's deals
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),\"Today's Deals\")]")));
        driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
        Utility.captureScreenshot(driver);

        //Opening firestick tv product page
        List<WebElement> productList = driver.findElements(By.xpath("//ul[@class='a-unordered-list a-nostyle a-horizontal a-spacing-none']//li"));
        for (int i = 0; i < menuList.size(); i++) {
            String iHTMLPL = productList.get(i).getAttribute("innerHTML");
            if (iHTMLPL.contains("Fire TV Stick 4K with Alexa Voice Remote (includes TV controls)")) {
                productList.get(i).click();
                break;
            }
        }
        Utility.captureScreenshot(driver);
    }
}
