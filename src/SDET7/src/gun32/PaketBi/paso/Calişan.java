package gun32.PaketBi.paso;

public class Calişan {
    int id;
    String name;
    String surname;
    private String password;

    public void sifreAta(String sifre){
        if (sifre.length()<8)
            System.out.println("uygun sifre gir");
        else {
            this.password =sifre;
            System.out.println("başarılı");
    }
}

    public void sifreGoster(){
        System.out.println("**** = " + password.substring(4));}}