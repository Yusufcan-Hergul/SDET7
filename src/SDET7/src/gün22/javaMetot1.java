package gün22;

public class javaMetot1 {
    public static void main(String[] args) {

        int s1=4;
        int s2=6;
        int s3=27;
        int s4=45;

        int sonuc1=toplam(s1,s2);
        int sonuc2=toplam(s1,s2,s3);
        int sonuc3=toplam(s1,s2,s3,s4);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

    }
    public static int toplam(int...sayılar){
        int toplam=0;
        for (int i = 0; i < sayılar.length; i++)
        toplam=toplam+ sayılar[i];

        return toplam;


    }






}
