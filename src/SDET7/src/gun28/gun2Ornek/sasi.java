package gun28.gun2Ornek;

public class sasi {
    public static void main(String[] args) {


        Person kişi1=new Person();
        kişi1.name="Hatice";
        kişi1.surname="Namlı";
        kişi1.age=20;

        Person kişi2=new Person();
        kişi2.name="Vasif";
        kişi2.surname="Zeynalov";
        kişi2.age=23;

        //1.yöntem

        System.out.println("kişi2 = " + kişi1.name);
        System.out.println("kişi2.surname = " + kişi1.surname);
        System.out.println("kişi2.age = " + kişi1.age);

        System.out.println("kişi2.name = " + kişi2.name);
        System.out.println("kişi2.surname = " + kişi2.surname);
        System.out.println("kişi2.age = " + kişi2.age);

        System.out.println();
        //2.yöntem


        System.out.println();
        //3.yöntem
        BilgiYazdır(kişi1);
        BilgiYazdır(kişi2);

        System.out.println();
        kişi1.getBirthYear();
        kişi2.getBirthYear();

        kişi1.getInıtıals();
        kişi2.getInıtıals();
    }
public static void BilgiYazdır(Person kisi){
    System.out.println("kisi.name = " + kisi.name);
    System.out.println("kisi.surname = " + kisi.surname);
    System.out.println("kisi.age = " + kisi.age);
}

}

