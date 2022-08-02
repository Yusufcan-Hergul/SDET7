package gun37;

public class Arac {
    private String renk;
    private int motor;
    private int model;

    public Arac(String renk, int motor, int model) {
    }

    private String renk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int motor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int model() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model=" + model +
                '}';
    }

    

    
}
