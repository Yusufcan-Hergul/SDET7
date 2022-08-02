package gun29.m;

import java.util.ArrayList;

public class student {
    String name;

    int maxCredit;

    ArrayList<lesson> dersleri=new ArrayList<>();

    public void dersEkle(lesson ders){

        //gelen dersin kredisi artı var olan krediyi toplayıp
        //kontrol edecegiz , öğrencini maxKredisi aşıyor mu?
        int toplamAlinanKredi=0;
        for (lesson l:dersleri)
            toplamAlinanKredi+=l.credit;

        if (toplamAlinanKredi+ders.credit<=maxCredit){
            dersleri.add(ders);
        }else System.out.println("\"alınabilecek kredi miktarı aşıldı\"+ders.name = " + "alınabilecek kredi miktarı aşıldı"+ders.name);
    }
}
