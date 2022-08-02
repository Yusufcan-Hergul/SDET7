package gun1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class giris1 {

    @Test(priority = 1)
    void webSitesiAc(){
        System.out.println("driver tanımlardı ve web sitesi açıldı");
    }

    @Test(priority = 2)
    void LoginTestIsleminiYap(){
        System.out.println("login test işlemi yapıldı");
    }

    @Test(priority = 3)
    void driverKapat(){
        System.out.println("driver kapatıldı ve çıkıldı");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("her test methottan önce başlayacak : Before Method");
    }
    @AfterMethod
    void afterMetot() {
        System.out.println("her test metottan önce başlayacak : after method");
    }
    @BeforeClass
     void beforeclass(){ System.out.println("her classdan önce çalışacak : beforeClass");
    }
    @Test
    void test(){System.out.println("test 1 çalıştı");
    }
    @Test
    void  test2(){
        System.out.println("test 2 çalıştı");
    }

}
