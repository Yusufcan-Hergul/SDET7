package gun27;

import java.util.HashMap;
import java.util.Map;

public class javaMap {
    public static void main(String[] args) {


        Map<Integer, Integer> m= new HashMap<>();
        m.put(2,11); //2 key ine 11 atandı
        m.put(3,12);
        m.put(6,15);
        m.put(2,5);  //2 anahtarındaki degeri güncelledi

        System.out.println("m = " + m);  //m = {2=5, 3=12, 6=15} key value
        System.out.println("m.get(2) = " + m.get(2)); //2 anahtarındaki deger 5
        System.out.println("m.keySet() = " + m.keySet()); //m.keySet [2, 3, 6]
        System.out.println("m.values() = " + m.values()); //m.values [5, 12, 15]

        for (Integer k:m.keySet())
            System.out.println("k = " + k);

        for (Integer v: m.values())
            System.out.println("v = " + v);


        for (Map.Entry<Integer, Integer> anahtarValue : m.entrySet()) {

            System.out.println("anahtarValue = " + anahtarValue.getKey());
            System.out.println("anahtarValue = " + anahtarValue.getValue());
        }
        System.out.println("m.containsKey(2) = " + m.containsKey(2));
        System.out.println("m = " + m.containsValue(12));

        m.remove(2);
        System.out.println("m = " + m);

        System.out.println("m = " + m.size());

        m.clear();
        System.out.println("m = " + m);



    }
}
