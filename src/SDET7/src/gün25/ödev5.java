package gün25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ödev5 {
    public static void main(String[] args) {
        //rotateList() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        //Tersten yazılmış halini return edin.
        //Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        //cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"

        ArrayList<String> parametre=new ArrayList<>();
        parametre.add("New Henersey");
        parametre.add("New York");
        parametre.add("Atlanta");
        parametre.add("Florida");
        parametre.add("Ohio");

        System.out.println("rotateList(parametre) = " + rotateList(parametre));



    }
    public static int rotateList(ArrayList<String> babba) {
        for (int i = 0; i < babba.size()-1; i--) {
            Collections.reverse(babba);


        }
        System.out.println("babba = " + babba);


        return 0;
    }







}
