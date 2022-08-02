package gun35.ornk;

public class arabaMain {

    private String renk;
    private String model;
    private int motorhacmi;
    private int kapısayısı;

    public arabaMain(String renk, String model, int motorhacmi, int kapısayısı) {
        setRenk(renk);
        setKapısayısı(kapısayısı);
        setModel(model);
        setMotorhacmi(motorhacmi);

    }

    public arabaMain() {

    }


    public String renk() {
        return renk;

    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int motorhacmi() {
        return motorhacmi;
    }

    public void setMotorhacmi(int motorhacmi) {
        this.motorhacmi = motorhacmi;
    }

    public int kapısayısı() {
        return kapısayısı;
    }

    public void setKapısayısı(int kapısayısı) {
        this.kapısayısı = kapısayısı;
    }

    @Override
    public String toString() {
        return "arabaMain{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorhacmi=" + motorhacmi +
                ", kapısayısı=" + kapısayısı +
                '}';
    }
}
