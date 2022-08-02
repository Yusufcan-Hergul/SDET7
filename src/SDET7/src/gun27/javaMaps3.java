package gun27;

import java.util.HashMap;
import java.util.Map;

public class javaMaps3 {
    public static void main(String[] args) {
        Map<Integer, String> hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"dog");
        hm.put(4,"wolf");
        hm.put(11,"snake");
        System.out.println("hm = " + hm);

        Map<Integer, String> lhm=new HashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"dog");
        lhm.put(4,"wolf");
        lhm.put(11,"snake");
        System.out.println("hm = " + lhm);

        Map<Integer, String> hml=new HashMap<>();
        hml.put(9,"tilki");
        hml.put(2,"kedi");
        hml.put(30,"dog");
        hml.put(4,"wolf");
        hml.put(11,"snake");
        System.out.println("hm = " + hml);



    }
}
