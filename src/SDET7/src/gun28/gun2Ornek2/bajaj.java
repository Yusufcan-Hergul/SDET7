package gun28.gun2Ornek2;

public class bajaj {
    public static void main(String[] args) {



        Rectangle kişi=new Rectangle();
        kişi.length=5;
        kişi.weight=4;
        kişi.Cevre();
        kişi.Alan();
        // extra return gerekseydi main içinde

        int alan= kişi.Alan2();
        System.out.println("alan = " + alan);





    }

}
