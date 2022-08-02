package gün22;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {

        //// Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        //        // yaptıktan sonra main de yazdırını

        Scanner oku=new Scanner(System.in);

        System.out.println("1.sayı =");
        int sayı1= oku.nextInt();
        System.out.println("2.sayı =");
        int sayı2= oku.nextInt();

        int enb=enbBuyukBul(sayı1,sayı2);
        System.out.println("enb = " + enb);

    }

    public static int  enbBuyukBul(int sayı1,int sayı2) {
        if (sayı1>sayı2)
            return sayı1;
        else
            return sayı2;
    }


}

