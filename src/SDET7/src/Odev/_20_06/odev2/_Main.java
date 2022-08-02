package Odev._20_06.odev2;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("sayı a gir=");
        int sayı1= oku.nextInt();

        System.out.println("sayı b gir=");
        int sayı2= oku.nextInt();

        Sum sum=new Sum();
        sum.calculating(sayı1,sayı2);

        Divide d=new Divide();
        d.calculating(sayı1,sayı2);

        Multiply m=new Multiply();
        m.calculating(sayı1,sayı2);

        Substract s=new Substract();
        s.calculating(sayı1,sayı2);

        System.out.println("s = " + s);
        System.out.println("m = " + m);
        System.out.println("d = " + d);
        System.out.println("sum = " + sum);

    }

}
