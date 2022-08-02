package gün23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar = " + rakamlar);



        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar,0);
        System.out.println("rakamlar = " + rakamlar);

        Collections.replaceAll(rakamlar,0,2);
        System.out.println("rakamlar = " + rakamlar);
    }
}
