package gün25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hashSet2 {
    public static void main(String[] args) {
        HashSet<String> ts=new HashSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);


        TreeSet<String> ys=new TreeSet<>();
        ys.add("bir");
        ys.add("iki");
        ys.add("üç");
        ys.add("dört");
        ys.add("beş");
        System.out.println("ys = " + ys);

        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(517);
        ts2.add(1);
        System.out.println("ts2 = " + ts2);


        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        for (String s:renkler
             ) {
            System.out.println("s = " + s);

            Iterator gosterge=ts.iterator();
            while (gosterge.hasNext())
            {
                System.out.println("gosterge = " + gosterge.next());
            }

        }
    }
}
