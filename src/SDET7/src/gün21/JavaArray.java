package gün21;

public class JavaArray {
    public static void main(String[] args) {

        int[][] tablo={
                {1,2,3},
                {2,3,1},
                {5,5,5},
                {2,10,3} };
        int enb=tablo[0][0];
        System.out.println("tablo = " + tablo.length);
        System.out.println("tablo = " + tablo[0].length);
        System.out.println("tablo = " + tablo[1].length);
        System.out.println("tablo = " + tablo[2].length);
        System.out.println("tablo = " + tablo[3].length);


            for (int i = 0; i < tablo.length ; i++) //4 e kadar tablo.lengh sayır sayısı
            {

            for (int j = 0; j< tablo[i].length ; j++) { //3 her satırın eleman sayısını veriyor yani 3

                if (tablo[i][j]>enb)
                    enb=tablo[i][j];


            }
        }
        System.out.println("enb = " + enb);


    }
}
