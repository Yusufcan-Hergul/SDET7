package Gun19;

import gun40.Ornek2.Dikdortgen;

public class geometriMain {
    public static void main(String[] args) {
        dikdörtgen dk=new dikdörtgen();
        System.out.println("dk.alanı(4,5) = " + dk.alanı(4,5));
        System.out.println("dk.cevresi(4,5) = " + dk.cevresi(4,5));

        Daire dr=new Daire();
        System.out.println("dr.alanı() = " + dr.alanı(5));
        System.out.println("dr.cevresi(5) = " + dr.cevresi(5));
    }
}
