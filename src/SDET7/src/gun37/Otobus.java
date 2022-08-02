package gun37;

public class Otobus extends Arac{

    private int yolcuKapasitesi;

    public int yolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public Otobus(String renk, int motor, int model) {
        super(renk, motor, model);

        setYolcuKapasitesi(yolcuKapasitesi);
    }
    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +
                '}';
    }
}
