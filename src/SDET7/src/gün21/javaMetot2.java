package gün21;

import java.util.Scanner;

public class javaMetot2 {
    public static void main(String[] args) {

        tekmiCiftmi(3);
        tekmiCiftmi(4);
        tekmiCiftmi(55);
        tekmiCiftmi(66);

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int okunansayı= oku.nextInt();
        tekmiCiftmi(okunansayı);


    }

    public static void tekmiCiftmi(int sayı) {
        if (sayı%2 == 0)
            System.out.println("çift");

        else System.out.println("tek");

    }

    public static void tekmiCiftmiOku(){

        Scanner oku=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı= oku.nextInt();

        if (sayı%2 ==0)
            System.out.println("çift");
        else System.out.println("tek");
    }







}


