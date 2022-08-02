package gün24;

import java.util.ArrayList;
import java.util.Scanner;

public class mama {
    public static void main(String[] args) {
        //Soru 1: Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda
        //        yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("dersNo (tür-1, mat-2, fiz-3");
        int dersNotu= oku.nextInt();








    }
    public static void dersNotlarınıYazdır(ArrayList<ArrayList<Integer> > dersNotları,int dersNo){
        for (int i = 0; i < dersNotları.get(dersNo).size(); i++)
            System.out.println(dersNotları.get(dersNo).get(i));
        {


            //ortalamayı mainde yazdır.
        }


}
public static int dersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarListesi,int dersNo){

    int toplam=0;
    for (int i = 0; i < notlarListesi.get(dersNo).size(); i++)
    toplam=toplam+ notlarListesi.get(dersNo).get(i);
    return toplam/notlarListesi.get(dersNo).size();






    }
}

