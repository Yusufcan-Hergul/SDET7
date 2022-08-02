package gun20;

import java.util.Arrays;

public class ödev1 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //
        //Eğer aitse "true" çevirin.

        String[] kelimeler={"Apple" ," Orange" ," Banana" ,"Pineapple"};

        System.out.println("kelimeler = " + Arrays.toString(kelimeler).contains("Apple"));

    }
}
