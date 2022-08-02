package gun44;

public class catchFinally {
    public static void main(String[] args) {
        long startTime=0;
        String str="";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("hatadan onceki nokta");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
