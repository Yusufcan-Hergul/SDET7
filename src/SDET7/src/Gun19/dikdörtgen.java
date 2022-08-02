package Gun19;

public class dikdörtgen implements enuu{



    @Override
    public double cevresi(double... dizi) {
        double kisakenar=dizi[0];
        double uzunkenar=dizi[1];
        return (kisakenar*uzunkenar)*2;
    }


    @Override
    public double alanı(double... dizi) {
        double kisakenar=dizi[0];
        double uzunkenar=dizi[1];
        return kisakenar*uzunkenar;
    }
}
