package Gun17;

import java.util.Scanner;

public class hjj {
    public static void main(String[] args) {
        // 100 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[5];

        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("sayı gir");
            dizi[i]= oku.nextInt();
            toplam+=dizi[i];
        }
        int ortalama=toplam/ dizi.length;

        int J=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>ortalama)
                J++;
        }
        System.out.println("J = " + J);}
}
