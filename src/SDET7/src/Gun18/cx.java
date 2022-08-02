package Gun18;

import java.util.Arrays;

public class cx {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int[] sayı = new int[10];
        int[] tekler = new int[10];
        System.out.println("Arrays.toString(tekler) = " + Arrays.toString(tekler));
        for (int i = 0; i < sayı.length; i++)
            sayı[i] = (int) (Math.random() * 100);

        int J = 0;
        for (int i = 0; i < sayı.length; i++)
            if (sayı[i] % 2 == 1) {
                tekler[J] = sayı[i];
                J++;
            }


        System.out.println("Arrays.toString(tekler) = " + Arrays.toString(tekler));
        System.out.println("Arrays.toString(sayı) = " + Arrays.toString(sayı));

    }}


