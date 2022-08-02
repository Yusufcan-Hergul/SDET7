package gün25;

import java.util.ArrayList;

public class ödev1 {
    public static void main(String[] args) {

        ArrayList<String> ornekler = new ArrayList<>();
        ornekler.add("orange");
        ornekler.add("kiwi");
        ornekler.add("peach");
        ornekler.add("banana");
        ornekler.add("orange");
        System.out.println("changelnArraylist(ornekler,\"orange\") = " + changelnArraylist(ornekler, "orange"));


    }


    public static int changelnArraylist(ArrayList<String> s1, String sea) {
        int count = 0;
        for (int i = 0; i < s1.size(); i++) {
            if (s1.get(i).equalsIgnoreCase(sea)) {
                count++;
            }

        }
        return count;
    }
}
