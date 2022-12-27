package AmazonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main (String[] args) {
        //Setting chromedriver path
        System.setProperty("webdriver.chrome.driver", "/Users/akhilaracheloommen/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open amazon.de
        driver.manage().window().maximize();
        driver.get("https://www.amazon.de/");

        //Accepting cookies
        driver.findElement(By.id("sp-cc-accept")).click();

        //Logging in
        Login l = new Login();
        l.Login(driver);

        //Change the language to English
        ChangeLanguage cl = new ChangeLanguage();
        cl.changeLanguage(driver);
        
        //Checking the all menu
        BuyProduct bp = new BuyProduct();
        bp.buyFirestick(driver);

        //Adding product to basket
        AddToBasket ad = new AddToBasket();
        ad.AddToBasket(driver);

        //Go to basket
        ViewBasket vb = new ViewBasket();
        vb.ViewBasket(driver);

        //Deleting the product from cart
        DeleteProductFromBasket delete = new DeleteProductFromBasket();
        delete.DeleteProductFromBasket(driver);

        //Logging out
        Logout lo = new Logout();
        lo.Logout(driver);

        //Close the browser window
        driver.quit();
    }
}
