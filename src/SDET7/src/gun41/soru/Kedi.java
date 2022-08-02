package gun41.soru;

public class Kedi extends soru{
    public Kedi(String isim, boolean vahsi, int dogumtarihi) {
        super(isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("mama");
    }

    @Override
    public void yemekMiktarı() {
        System.out.println("200gr");
    }

    @Override
    public void gunlukUykuSüresi() {
        System.out.println("16 saat");
    }

    @Override
    public void sesi() {
        System.out.println("miyav");
    }
}
