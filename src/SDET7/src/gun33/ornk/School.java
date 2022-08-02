package gun33.ornk;

import java.sql.Struct;

public class School {
    public static void main(String[] args) {

        // Student (id, name, surName)
        // Yukarıdaki gibi 5 öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir id si olmalı.
        // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

        Student std1=new Student("ahmet","babba",1);

        Student std2=new Student("guner","ekinci",2);
        Student std3=new Student("fatma","ekinci",3);
        Student std4=new Student("done","ekinci",4);
        Student std5=new Student("ayşe","ekinci",5);

        System.out.println("std1 = " + std1);
        System.out.println("std2 = " + std2);
        System.out.println("std2 = " + std3);
        System.out.println("std2 = " + std4);
        System.out.println("std2 = " + std5);

        System.out.println("Student.sayac = " + Student.sayac);

        //odev
        // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme , arama
        // TODO: duzeltme imkanı veriniz. Öğrenci silinse bile en son
        // TODO: öğrenci sayısı doğru gözükmeli.



    }
}
