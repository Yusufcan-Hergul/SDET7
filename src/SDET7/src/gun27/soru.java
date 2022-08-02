package gun27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Çıkış

        Scanner oku=new Scanner(System.in);
        int sayı= oku.nextInt();


        switch (sayı){
            case 1:
                System.out.println("kelimenin anlamı");
            case 2:
                System.out.println("kelimenin anlamını düzeltme");
            case 3:
                System.out.println("listelemedir");
            case 4:
                System.out.println("arama");
            case 5:
                System.out.println("cıkıs");
                break;
        }

    }
}
