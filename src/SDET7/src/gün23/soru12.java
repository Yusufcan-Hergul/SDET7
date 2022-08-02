package gün23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[6];

        for (int i = 0; i < dizi.length; i++) {

            System.out.println("sayı=");
            dizi[i]= oku.nextInt();


        }
        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++)
        if (dizi[i] %2==1)
        tekler.add(dizi[i] );

        System.out.println("tekler = " + tekler);
        {

        }









    }
}
