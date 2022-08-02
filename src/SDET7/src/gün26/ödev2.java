package gün26;

import java.util.Scanner;

public class ödev2 {
    public static void main(String[] args) {

        //2-"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca


        Scanner oku=new Scanner(System.in);
        System.out.println("3 kelime gir=");
        String kelime= oku.nextLine();
        OrtaKelime(kelime);



    }
    public static String OrtaKelime(String paro) {

        int bosluk = paro.indexOf(" ");
        int ikinciBosluk = paro.lastIndexOf(" ");

        String bos = paro.substring(bosluk + 1, ikinciBosluk);


        System.out.println("orta = " + bos);
    return bos;}







}
