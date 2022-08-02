package soru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {


        public static WebDriver driver;

        static
        {
            // System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            Duration dr=Duration.ofSeconds(30);
            driver.manage().timeouts().pageLoadTimeout(dr);
            driver.manage().timeouts().implicitlyWait(dr);
        }

        public static void BekleKapat(){

            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            driver.quit();
        }
        public static void Bekle(int saniye){
            try {
                Thread.sleep(saniye*1000);

            }catch (InterruptedException e){
                throw new RuntimeException(e);
    }
}}
