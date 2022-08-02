package gun39.paket4;

public class Test implements IGosterir,IYazdırır{
    @Override
    public void goster() {
        System.out.println("goster");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println("mesaj = " + mesaj);

    }

    @Override
    public void yaz() {
        System.out.println("yaz");

    }
}
