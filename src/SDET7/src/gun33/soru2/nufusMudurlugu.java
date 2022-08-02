package gun33.soru2;

public class nufusMudurlugu {
    public static void main(String[] args) {

        // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
        // tcNo değerini int olarak alınız ve nesne oluşturulurken
        // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
        // kontrol için mainde 2 kişi tanımlayınız.

        Vatandaş v1=new Vatandaş("ismet");
        Vatandaş v2=new Vatandaş("Nazmiye");
        Vatandaş v3=new Vatandaş("Mehmet");

        //v1.tc

        final double pi=3.14;  //tanımlanırken

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

    }
}
