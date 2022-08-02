package Gun19;

import java.util.ArrayList;
import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {

        //getSum isminde bir method oluşturun.
        //Parametresi ArrayList'tir.
        //Dizideki tüm $ ları kaldır ve tüm sayıları topla
        //return yaptğımız veri tipi 'int' olmalıdır.
        //sonuç 0'dan küçükse, -1 yazdırın.
        //Örnek1:
        //ArrayList = $13, $15, $20
        //Cevap = 48 olmalı
        //Örnek 2 :
        //ArrayList= $-13, $0, $0
        //Cevap = -1 olmalı.



    }
    public static void getSum(String[] arra){
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("kaç dolar=");
            arra[i]= oku.nextLine();

            for (int j = 0; j < arra.length; j++) {
                String kal=arra[j].replace("$"," ");

            }
            int toplam=0;
            for (int j = 0; j < arra.length; j++) {

                Integer.parseInt(arra[j]);

            }
            for (int j = 0; j < arra.length; j++) {
                

            }


        }
    }
    
}
