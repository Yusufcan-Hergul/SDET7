package gun20;

public class ödev8 {
    public static void main(String[] args) {
        //8-
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.


        int[] sayı={12,14,21,23,10,4};

        int toplam=0;

        for (int i=0 ;i<sayı.length ;i++){

            toplam +=sayı[i];


        }

        System.out.println("toplam = " + toplam/6);
    }
}
