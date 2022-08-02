package gun44;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class _1_Running {
    public static void main(String[] args) {

        try {
            System.out.println("program başladı");
            LocalDate tarih= LocalDate.of(2018, Month.APRIL,48);
            System.out.println("işlem tamamlandı");
        }
        catch (Exception hata){
        System.out.println("hata.ge = " + hata.getLocalizedMessage());}

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");


        try {

        }
        catch (Exception hata){

        }

        Scanner oku=new Scanner(System.in);
        try {
            System.out.println("sayı1 gir=");
            int sayı1 = oku.nextInt();

            System.out.println("sayı 2 gir=");
            int sayı2 = oku.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
