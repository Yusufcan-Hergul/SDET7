package gün25;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs2=new HashSet<>();
        hs2.add(1);
        hs2.add(5);
        hs2.add(7);
        hs2.add(34);
        hs2.add(13);

        System.out.println("hs2 = " + hs2);

        hs2.remove(1);
        System.out.println("hs2 = " + hs2);

        if (hs2.contains(5))
            System.out.println("5 var");
        else System.out.println("5 yok");

        hs2.clear();
        System.out.println("hs2 = " + hs2);
    }
}
