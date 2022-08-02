package gün25;

import java.util.HashSet;

public class hashSett {
    public static void main(String[] args) {
        HashSet<Integer>setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        HashSet<Integer> BirleşikHali=new HashSet<>();
        BirleşikHali.addAll(setA);
        BirleşikHali.addAll(setB);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        HashSet<Integer> farklı=new HashSet<>();
        farklı.addAll(setA);
        farklı.remove(setB);
        System.out.println("farklı = " + farklı); //123

        HashSet<Integer> ortakEleman=new HashSet<>();
        ortakEleman.addAll(setA);
        ortakEleman.retainAll(setB);
        System.out.println("ortakEleman = " + ortakEleman);

    }
}
