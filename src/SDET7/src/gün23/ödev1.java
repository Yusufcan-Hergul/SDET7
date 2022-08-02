package gün23;

import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.



        randomNum(6);

    }
    public static int randomNum(int sayı){
        int rand=0;

        rand=(int) (Math.random()*sayı);
        System.out.println("rand = " + (int)(Math.random()*sayı));
        return rand;


    }






}
