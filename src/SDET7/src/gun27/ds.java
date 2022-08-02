package gun27;

import java.util.Arrays;
import java.util.Scanner;

public class ds {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve ortalamasını bulduktan sonra
        // bu dizinin bütün elemanlarının karelerini yeni bir diziye atınız
        // bu dizininde en küçük, en büyük elemanını ve ortalamasını bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] ele=new int[5];

        for (int i = 0; i < ele.length; i++) {
            System.out.println("sayı gir=");
            ele[i]= oku.nextInt();
        }
        enb(ele);
        enk(ele);
        ort(ele);
    }
    public static void enb(int[] ele){
        Arrays.sort(ele);
        System.out.println("ele[0] = " + ele[0]);
    }
    public static void enk(int[] ele) {
        Arrays.sort(ele);
        System.out.println("ele[-1] = " + ele[-1]);
    }
     public static void ort(int[] ele)   {
        int toplam=0;
        for (int i = 0; i < ele.length; i++) {
            toplam+=ele[i];
            int ort=toplam/ ele.length;}




        }




    }







