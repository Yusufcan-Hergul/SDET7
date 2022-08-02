package gun41.odev2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.println("1 gir=");
        int sayı1= oku.nextInt();

        System.out.println("2.gir=");
        int sayı2= oku.nextInt();

        Sum sum=new Sum();
        sum.calculating(sayı1,sayı2);

        Divide divide=new Divide();
        Multiply mult=new Multiply();
        divide.calculating(sayı1,sayı2);
        mult.calculating(sayı1,sayı2);
        Substract substract=new Substract();
        substract.calculating(sayı1,sayı2);



    }
}
