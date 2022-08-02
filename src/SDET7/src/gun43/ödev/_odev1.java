package gun43.ödev;

import java.util.ArrayList;

public class _odev1 {
    public static void main(String[] args) {

    }

    public static int getCount(ArrayList<String> p1) {

        p1.add("Orange");
        p1.add("Kiwi");
        p1.add("Peach");
        p1.add("Banana");
        p1.add("Orange");


        int J = 0;
        for (int i = 0; i < p1.size(); i++) {
            if (p1.contains("Orange"))
                System.out.println(J = J + 1);


        }
        System.out.println("J = " + J);
        return J;
    }


}
