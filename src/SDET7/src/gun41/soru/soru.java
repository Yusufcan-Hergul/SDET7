package gun41.soru;

public abstract class soru {

    int id;
    String isim;
    boolean vahsi;
    int dogumtarihi;

    static int sayaç=0;

    abstract void yiyecegi();

    abstract void yemekMiktarı();

    abstract void gunlukUykuSüresi();

    abstract void sesi();

    public int id() {
        return ++sayaç;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String isim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean vahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public int dogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(int dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public soru(String isim, boolean vahsi, int dogumtarihi) {
        setId(id);
        setIsim(isim);
        setVahsi(vahsi);
        setDogumtarihi(dogumtarihi);
        sesi();
    }

    @Override
    public String toString() {
        return "soru{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumtarihi=" + dogumtarihi +
                '}';


    }
}
