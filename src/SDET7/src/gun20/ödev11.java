package gun20;

public class ödev11 {
    public static void main(String[] args) {
        //11. İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] sayılar = {25, 30, 30, 35, 100};

        int toplam = 0;

        for (int i = 0; i < sayılar.length; i++) {
            toplam += sayılar[i];

            }System.out.println("toplam = " + toplam);
        }
    }
