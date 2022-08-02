package gun1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Enable {

    @Test
    void  test1(){
        System.out.println("test 1");
    }

    @Test(enabled = false)
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test 3");
    }

    @BeforeClass
    void BaslangicIslemleri(){
        System.out.println("driver start");
    }

    @AfterClass
    void Bitisİşlemleri(){
        System.out.println("driver stop");
    }

















}
