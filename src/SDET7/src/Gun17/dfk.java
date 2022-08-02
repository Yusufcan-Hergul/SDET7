package Gun17;

import java.util.Scanner;

public class dfk {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int[] sayı=new int[7];
        for (int i = 0; i < sayı.length; i++) {
            System.out.println("sayı gir=");
            sayı[i]= oku.nextInt();
        toplam+=sayı[i];
        }
        int ort=toplam/ sayı.length;



        int J=0;
        for (int i = 0; i < sayı.length; i++) {
            if (sayı[i]>ort && sayı[i]%2 == 1)
                J++;

        }
        System.out.println("J = " + J);



    }


}
