package gun30.soru;

import java.util.ArrayList;

public class studentS {

    String name;

    int maxCredit;
    int liste;

    ArrayList<Lesson> dersler=new ArrayList();

    public void dersEklenen(Lesson ders){
        int toplamAlınanKredi=0;
        for (Lesson l:dersler)
            toplamAlınanKredi+=l.credit;

        if (toplamAlınanKredi+ders.credit<=maxCredit){
            dersler.add(ders);
        }else System.out.println("\"alınabilecek kredi miktarı aşıldı\" = " + "alınabilecek kredi miktarı aşıldı");

    }
}
