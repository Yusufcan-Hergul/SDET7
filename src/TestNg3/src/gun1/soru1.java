package gun1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class soru1 {
    /*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 */



        @Test
        void LoginTest(){

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("asd@gmail.com");

        WebElement pasw=driver.findElement(By.id("input-password"));
        pasw.sendKeys("123qweasd");

        WebElement loginBtn=driver.findElement(By.cssSelector("input"));
        loginBtn.click();

    }
}
