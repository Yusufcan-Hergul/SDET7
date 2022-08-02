package Gun16;

import java.util.Scanner;

public class ss {
    public static void main(String[] args) {
        // 9-Girilen bir cümledeki kelimelerin baş
        // harflarini yazdırınız.(Regex kullanmayın)

        Scanner oku=new Scanner(System.in);
        System.out.println("cumle gir=");
        String kelime= oku.nextLine();

        System.out.println(kelime.charAt(0));

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)==' ')
                System.out.println( kelime.charAt(i+1));
            
        }
    }
}
