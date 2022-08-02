package gun30.soru;

public class soru {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

        Lesson ders1=new Lesson();
        ders1.name="mat101";
        ders1.credit=4;

        Lesson ders2=new Lesson();
        ders2.name="fiz102";
        ders2.credit=6;

        Lesson ders3=new Lesson();
        ders3.name="kim32";
        ders3.credit=9;

        Lesson ders4=new Lesson();
        ders4.name="sos22";
        ders4.credit=3;

    }
}
