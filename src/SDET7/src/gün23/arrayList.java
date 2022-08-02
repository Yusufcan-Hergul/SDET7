package gün23;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> isimler=new ArrayList<>();

        isimler.add("ahmet");
        isimler.add("senlaeee");

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"zeynep");
        System.out.println("isimler = " + isimler);

        isimler.set(1,"fatıh");
        System.out.println("isimler = " + isimler);

        int elemanSayısı=isimler.size();
        System.out.println("elemanSayısı = " + elemanSayısı);

        isimler.remove("fatıh");
        System.out.println("isimler = " + isimler);

        isimler.remove(1);
        System.out.println("isimler = " + isimler);

        int indexofKaya=isimler.indexOf("kaya");
        System.out.println("indexofKaya = " + indexofKaya);

        for (int i = 0; i < isimler.size(); i++)
            System.out.println("isimler.get(i) = " + isimler.get(i));


    }
}
