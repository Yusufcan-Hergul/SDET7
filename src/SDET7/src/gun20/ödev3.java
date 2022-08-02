package gun20;

import java.util.Arrays;

public class ödev3 {
    public static void main(String[] args) {
        //3-
        //
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //
        //En küçük (minimum) sayıyı yazdırınız.

        int[] sayı={14,19,5,21};

        int min=sayı[0];

        for (int i=0;i< sayı.length;i++){

            if (min> sayı[i]){

                min =sayı[i];

                System.out.println("min = " + min);



            }






        }


        




    }
}
