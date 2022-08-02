package gün25;

import java.util.ArrayList;

public class ödev4 {
    public static void main(String[] args) {

        ArrayList<String> sene=new ArrayList<>();
        sene.add("yellow");
        sene.add("red");
        sene.add("blue");
        sene.add("red");
        sene.add("blue");

        System.out.println("sene = " + sene);

        ArrayList<String> list=nela(sene,"blue","yellow");

        System.out.println("list = " + list);


    }
    public static ArrayList<String> nela(ArrayList<String> list,String s1,String s2){


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s2)){
                list.set(i,s1);
            }


        }
return list;

    }








}
