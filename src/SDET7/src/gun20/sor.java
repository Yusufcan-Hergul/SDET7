package gun20;

import java.util.Arrays;
import java.util.Scanner;

public class sor {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("sayı gir=");
            dizi[i] = scan.nextInt();}

        int[] dizi2=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi2[i]=dizi[i];

        }
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        int enb=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>enb)
                enb=dizi[i];
        }
        int enk=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]<enk)
                enk=dizi[i];
        }
        System.out.println("enb = " + enb);
        System.out.println("enk = " + enk);
        System.out.println("toplam/ dizi.length = " + toplam/ dizi.length);
        System.out.println("dizi2 = " + dizi2);

    }
}
