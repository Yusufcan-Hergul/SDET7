package gun43.soru;

public class kartal implements Wild{
    /**
     *
     */
    @Override
    public void liveİn() {
        System.out.println("daglarda");
    }

    /**
     *
     */
    @Override
    public void walks() {
        System.out.println("yürür");
    }

    /**
     *
     */
    @Override
    public void eats() {
        System.out.println("et");
    }

    /**
     *
     */
    @Override
    public void hunts() {
        System.out.println("yılan");
    }
}
