package gun33.ornek3;

import java.util.Scanner;

public class ornek {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.println("gün=");gun=oku.nextInt();
        System.out.println("saay=");saat= oku.nextInt();
        System.out.println("dakika");dak= oku.nextInt();

        int toplamSaniye=
                gun*Sabitler.birGundekiSaatsayısı * Sabitler.birDakikadakiSaniyesayısı
                *Sabitler.birSaattekiDakikasayısı + saat * Sabitler.birSaattekiDakikasayısı * Sabitler.birDakikadakiSaniyesayısı +
                        dak * Sabitler.birDakikadakiSaniyesayısı;

        System.out.println("toplamSaniye = " + toplamSaniye);

        System.out.println("Sabitler. = " + Sabitler.hesapla(gun,saat,dak));
    }
}
