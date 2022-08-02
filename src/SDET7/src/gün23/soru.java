package gün23;

import java.util.ArrayList;
import java.util.Scanner;

public class soru {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
    Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();


        String devamMİ="";
    int toplam=0;

        do {
        System.out.println("not=");
        int ogrNot=okuInt.nextInt();
        notlar.add(ogrNot);
        toplam+=ogrNot;

        System.out.println("devam etmek istiyor musun (E/H");
        devamMİ=oku.next();
    }while (devamMİ.equalsIgnoreCase("E"));


        int ort=toplam/notlar.size();

        int gecenSayısı=0;
        for (int i = 0; i < notlar.size(); i++)
            if (notlar.get(i)>=ort)
                gecenSayısı++;
        System.out.println("gecenSayısı = " + gecenSayısı);








    }







    }

