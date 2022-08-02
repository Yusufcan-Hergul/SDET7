package gun28.gun3Ornek;

public class ogre {
    public static void main(String[] args) {


//  /*
//        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
//        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar) class tanımlayınız
//        3.Adım  :Musteriye bir ElektrikHesabi ekleyiniz.
//
//        4.Adım  :1 tane müşteri oluşturunuz,
//        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
//                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
//        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.
//
//        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
//                ondan sonra toplam alarak çıkartınız  */

Musteri mus1=new Musteri();
mus1.name="ismet";
elektrikHesba hesap = new elektrikHesba();
mus1.elektrikHesba= hesap;

mus1.elektrikHesba.tuketimEKLE(100);
mus1.elektrikHesba.tuketimEKLE(200);
mus1.elektrikHesba.tuketimEKLE(300);

mus1.elektrikHesba.setToplamTüketimYaz();

    }}


