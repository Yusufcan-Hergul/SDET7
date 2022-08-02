package gun28.gun2Ornek;

import java.util.Locale;

public class Person {

String name;

String surname;

int age;

public void BilgiYazdır(){

    System.out.println("name = " + name);
    System.out.println("surname = " + surname);
    System.out.println("age = " + age);
}

public void getBirthYear(){
    System.out.println("2022-age = " + (2022-age));
}
public void getInıtıals(){
    System.out.println(" = " + name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".");
}

}
