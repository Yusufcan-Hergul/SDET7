package gün21;

import java.util.Arrays;
import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve ortalamasını bulduktan sonra
        // bu dizinin bütün elemanlarının karelerini yeni bir diziye atınız
        // bu dizininde en küçük, en büyük elemanını ve ortalamasını bulunuz.


        int[] dizi=new int[5];

        Scanner oku=new Scanner(System.in);


        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("sayı=");
            dizi[i] = oku.nextInt();
        }

        enBuyukYaz(dizi);
        enKucukyaz(dizi);
        ortalamaYaz(dizi);
        }

        public static void enKucukyaz (int[] dizi)
        {
            Arrays.sort(dizi); //diziyi küçükten büyüğe sıraladık
            System.out.println("en küçük = " + dizi[0]); //en küçük
        }
        public static void enBuyukYaz (int[] dizi)
        {
            Arrays.sort(dizi); //diziyi küçükten büyüğe sıraladık
            System.out.println("dizi = " + dizi[dizi.length - 1]); //en büyüğü aldık
        }
        public static void ortalamaYaz(int[] dizi)
        {
            int toplam=0;
            for (int i = 0; i < dizi.length ; i++) {
                toplam += dizi[i];
            }
            int ort=toplam/ dizi.length;
            System.out.println("ort = " + ort);

            }







        }

















