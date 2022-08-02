package Odev._20_06.odev3;

import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {



    paro("1234567899");

    }
    public static String paro (String s){
       
        int toplam=0;
        int cevir=Integer.parseInt(s);
        for (int i = 0; i < s.length(); i++) {
            if (cevir%2==0)
                toplam+=cevir;
            else toplam-=cevir;

        }
        System.out.println("toplam = " + toplam);


        return s;
    }}
