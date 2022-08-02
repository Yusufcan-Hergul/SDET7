package Gun16;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        //6-Kullanıcnın gireceği bir sayının basamaklarına
        // göre tersi olan sayıyı bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir=");
        int sayı=scan.nextInt();

        int tersi=0;

        while (sayı>0){
            int sonbas=sayı%10;
            tersi=tersi*10+sonbas;
            sayı=sayı/10;


        }
    }
}
