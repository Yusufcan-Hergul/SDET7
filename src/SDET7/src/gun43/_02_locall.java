package gun43;

public class _02_locall {
    public static void main(String[] args) {

        String cumle1="bugun hava cok guzel";
        String cumle2="bugun hava cok guzel";

        String cumle3=new String("bugun hava cok guzel");
        String cumle4=new String("bugun hava cok guzel");

        if (cumle1 == cumle2)
            System.out.println("eşit");
        else
            System.out.println("esit degil");

        if (cumle1.equals(cumle2))
            System.out.println("eşit");
        else System.out.println("esit degil");

        if (cumle3 == cumle4)
            System.out.println("esit");
        else System.out.println("esit degil");

        if (cumle3.equals(cumle4))
            System.out.println("esit");
        else System.out.println("esit degil");
    }
}
