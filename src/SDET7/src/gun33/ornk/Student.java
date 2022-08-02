package gun33.ornk;

public class Student {
    int ID;
    String name;
    String surname;

    static int sayac=1;

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Student(String name, String surname, int ID){
        this.name=name;
        this.surname=surname;
        this.ID=sayac++;


    }
}
