package Gun16;

import java.util.Scanner;

public class jskfd {
    public static void main(String[] args) {
        //10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen
        // önce girilenden büyük ise döngü sonlansın.

        Scanner oku=new Scanner(System.in);


        int sonra=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("sayı" + "sayıgir=");
            int sayı= oku.nextInt();
            if (sonra>sayı)
                break;
            sonra=sayı;


        }


    }
}
