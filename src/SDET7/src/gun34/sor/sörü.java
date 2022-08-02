package gun34.sor;

public class sörü {
    public static void main(String[] args) {

        // Bir User yetkilendirme modülü yapılması isteniyor.
        // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
        // USER STATUSU : AKTIF, PASIF
        // Yukarıdaki şekilde bir USER class ı tanımlayınız
        // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
        // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
        // SILME işlemi kontrolü yapınız bir metod için.

        User user1=new User("ismet", UserStatus.AKTİF,Role.ADMIN);
        User user2=new User("mehmet",UserStatus.AKTİF,Role.PERSONEL);
        User user3=new User("ayşe",UserStatus.PASİF,Role.MUDUR);
        user3.role =Role.PERSONEL;

        UserSil(user1);

    }

    public static void UserSil(User user){
        if (user.role == Role.ADMIN){
            System.out.println("admin slinlemez");
        }

    }


}

