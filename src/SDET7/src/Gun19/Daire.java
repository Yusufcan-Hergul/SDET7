package Gun19;

public class Daire implements enuu{

    @Override
    public double cevresi(double... dizi) {
        return Math.PI*dizi[0]*dizi[0];
    }


    @Override
    public double alanı(double... dizi) {
        double yarıcap=dizi[0];
        return Math.PI*yarıcap*2;
    }
}
