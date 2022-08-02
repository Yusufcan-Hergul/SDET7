package gun29.m;

public class soruu {
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

        lesson ders1=new lesson();
        ders1.name="Mat101";
        ders1.credit=4;

        lesson ders2=new lesson();
        ders2.name="Java101";
        ders2.credit=3;

        lesson ders3=new lesson();
        ders3.name="Alg101";
        ders3.credit=6;

        student ogr1=new student();
        ogr1.name="Vasif";
        ogr1.maxCredit=10;

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);
    }



}
