package Gun18;

import java.util.Scanner;

public class dsfjuh {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("cumle gir=");
        String cumle=oku.nextLine();

        int J=0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' ')
            J++;
        }
        System.out.println("J = " + (J+1));}
}
