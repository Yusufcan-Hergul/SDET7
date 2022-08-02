package Gun16;

import java.util.Scanner;

public class js {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("cumle gir=");
        String kelime= oku.nextLine();

        int sayısı=0;

        for (int i = 0; i < kelime.length(); i++) {

            if (kelime.charAt(i) == 'a')
                sayısı++;
        }
        System.out.println("sayısı = " + sayısı);
    }
}
