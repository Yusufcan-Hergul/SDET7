package gun40.Ornek2;

public class Dikdortgen extends Sekil{


    private double kisakenar;

    private double uzunkenar;

    public Dikdortgen(double kisakenar, double uzunkenar) {
        setKisakenar(kisakenar);
        setUzunkenar(uzunkenar);
    }

    public Dikdortgen() {

    }

    public double kisakenar() {
        return kisakenar;
    }

    public void setKisakenar(double kisakenar) {
        this.kisakenar = kisakenar;
    }

    public double uzunkenar() {
        return uzunkenar;
    }

    public void setUzunkenar(double uzunkenar) {
        this.uzunkenar = uzunkenar;
    }



    @Override
    public double alan() {
        return 0;
    }

    @Override
    public double cevre() {
        return 0;
    }
}

