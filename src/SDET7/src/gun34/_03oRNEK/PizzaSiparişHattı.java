package gun34._03oRNEK;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparişHattı {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<pizza> sipariş=new ArrayList<>();

        int secim=0;

        do {
            menu();
            secim= oku.nextInt();

            switch (secim){
                case 1:pizza ps=new pizza(PizzaSize.SMALL);
                    sipariş.add(ps); break;
                case 2:pizza pm=new pizza(PizzaSize.MEDİUM);
                    sipariş.add(pm); break;
                case 3:pizza pl=new pizza(PizzaSize.LARGE);
                    sipariş.add(pl); break;
                case 4:siparişYaz(sipariş);break;
            }
            System.out.println("sipariş = " + sipariş);
        }while (secim<=4);

    }public static void menu(){
        System.out.println("pizza menu");
        System.out.println("1.small=");
        System.out.println("2.medium=");
        System.out.println("3.large=");
        System.out.println("4-işleme al=");
        System.out.println("5-cıkıs=");
        System.out.println("secim");
    }

    public static void siparişYaz(ArrayList<pizza> sipariş){

        int smallcnt=0;
        int mediumcnt=0;
        int largecnt=0;

        for (pizza p:sipariş){
            if (p.size == PizzaSize.SMALL) smallcnt++;
            if (p.size == PizzaSize.MEDİUM) mediumcnt++;
            if (p.size == PizzaSize.LARGE) largecnt++;
        }
        System.out.println("largecnt = " + largecnt);
        System.out.println("mediumcnt = " + mediumcnt);
        System.out.println("smallcnt = " + smallcnt);
        System.out.println("siparişiniz alınmıştir");

        //ÖDEV :her pizza tipi için ücret belirleyerek toplam ücreti yazınız
    }

    }
