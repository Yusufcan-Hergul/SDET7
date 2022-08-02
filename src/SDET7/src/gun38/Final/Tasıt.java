package gun38.Final;

public class Tasıt {

    public final String model;

    @Override
    public String toString() {
        return "Tasıt{" +
                "model='" + model + '\'' +
                '}';
    }

    public String model() {
        return model;
    }

    public Tasıt(String model) {
        this.model = model;




    }
}
