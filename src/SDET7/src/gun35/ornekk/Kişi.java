package gun35.ornekk;

public class Kişi {

    String ad;

    String soyad;

    private int yas;

    public Kişi(){

    }

    public Kişi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Kişi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }



}

