package Gun18;

public class jkh {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] sayı=new int[100];

        for (int i = 0; i < sayı.length; i++) {
            sayı[i]=(int) (Math.random()*100);
        }

        int enb=sayı[0];
        int index=0;
        for (int i = 0; i < sayı.length; i++) {
            if (sayı[i] > enb) {
                enb = sayı[i];
                index=i;
            }
        }
            System.out.println("enb = " + enb);
            System.out.println("index = " + index);

        }}





