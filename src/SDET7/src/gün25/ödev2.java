package gün25;

import java.util.ArrayList;

public class ödev2 {
    public static void main(String[] args) {


        ArrayList<Integer> sayı=new ArrayList<>();
        sayı.add(1);
        sayı.add(2);
        sayı.add(3);
        sayı.add(4);
        sayı.add(5);

        System.out.println("getSum(sayı) = " + getSum(sayı));

    }

public static int getSum(ArrayList<Integer> salo) {

    int toplam = 0;
    for (int i = 0; i < salo.size(); i++) {
        toplam += salo.get(i);


    }

    System.out.println("toplam = " + toplam);
    return toplam;


}}