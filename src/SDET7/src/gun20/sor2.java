package gun20;

import java.util.Scanner;

public class sor2 {
    public static void main(String[] args) {

        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
        // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
        Scanner scan=new Scanner(System.in);
        int sayı=0;

        do {
            liste();
            int secım=scan.nextInt();


        }while (sayı<6);



    }
    public static void liste(){

        System.out.println(" 1-toplama\n" +
                "            2-çıkarma\n" +
                "            3-çarpma\n" +
                "            4-bolme\n" +
                "            5-Faktöryel\n" +
                "            6-Çıkış");

    }
    public static void secim(int sec){
       Scanner scan2=new Scanner(System.in);
        if (sec>5)
            System.out.println("sayı1 gir=");
        int sayı1=scan2.nextInt();

        System.out.println("sayı2 gir=");
        int sayı2=scan2.nextInt();



        switch (sec){
            case 1:
        }

    }public static void toplam(int sayı1, int sayı2){
        System.out.println(sayı1+sayı2);

    }public static void cıkar(int sayı1,int sayı2){
        System.out.println(sayı1-sayı2);

    }public static void carp(int sayı1,int sayı2){
        System.out.println(sayı1*sayı2);

    }public static void bolme(int sayı1,int sayı2){
        System.out.println(sayı1/sayı2);
    }

}
