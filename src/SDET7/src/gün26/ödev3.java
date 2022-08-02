package gün26;

import java.util.Scanner;

public class ödev3 {
    public static void main(String[] args) {
        //3-
        // reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ



        reverseString("Javayı Seviyorum");



    }
    public static void reverseString(String paraa) {

        for (int i = 0; i < paraa.length()-1; i--) {

            System.out.println(paraa.charAt(i));


        }



    }


}
