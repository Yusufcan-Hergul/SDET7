package gun34._03oRNEK;

public class pizza {

    PizzaSize size;

    public pizza(PizzaSize size){
        this.size =size;
    }

    @Override
    public String toString() {
        return "pizza{" +
                "size=" + size +
                '}';
    }
}
