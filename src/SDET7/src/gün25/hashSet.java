package gün25;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi=hs1.add(5);
        System.out.println("eklendiMi = " + eklendiMi);

        System.out.println("hs1 = " + hs1);


    }
}

