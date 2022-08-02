package gun44;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.println("kullaıcı ve şifre gir");

        System.out.println("kullanıcı=");
        String username=oku.nextLine();

        System.out.println("şifre gir=");
        String password=oku.nextLine();

        try {
            if (password.length()< 8)
                throw new Exception("şifre 8 den fazla olamaz");

            if (password.length()>15)
                throw new Exception("şifre 15den fazla olamaz");
        }
        catch (Exception e){
            System.out.println("lütfen dikkat");
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
