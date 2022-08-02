package gun1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {

    @Test
    void EqualsOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
    }

    @Test
    void notEqualsOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        Assert.assertNotEquals(s1,s2,"karşılaştırma sonucu");
    }
    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=555;

        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");
    }
    @Test
    void  nullOrnek(){
        String s1=null;
        String s2 = null;
        Assert.assertTrue(s1==s2,"karşılaştırma sonucu");
    }
    @Test
    void direktFail(){
        Assert.fail();
    }

}
