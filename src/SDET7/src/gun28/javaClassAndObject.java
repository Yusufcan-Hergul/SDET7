package gun28;

import java.util.Scanner;

public class javaClassAndObject {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        Araba benimArabam=new Araba();
        benimArabam.renk="kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yılı=2021;

        System.out.println("benimArabam = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.yılı = " + benimArabam.yılı);


    }
}
class Araba {

    String renk;

    int yılı;

    double motorHacmi;
}