package gün25;

import java.util.ArrayList;

public class ödev3 {
    public static void main(String[] args) {


        ArrayList<String> sayı=new ArrayList<>();
        sayı.add("New jersey");
        sayı.add("New York");
        sayı.add("Ohio");
        sayı.add("Florida");
        sayı.add("Boston");
        System.out.println("getLength(sayı) = " + getLength(sayı));


    }
    public static ArrayList<Integer> getLength(ArrayList<String> inputArray){

        ArrayList<Integer> outputArray = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            outputArray.add(inputArray.get(i).length());

        }
return outputArray;



}




}
