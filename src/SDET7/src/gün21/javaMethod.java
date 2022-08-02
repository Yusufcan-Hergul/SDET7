package gün21;

public class javaMethod {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        Math.max(4,5); //daha önce yazılmış biz çağırıp kullanıyoruz
        //aynı bunu gibi biz de böyle metotlar yazabilirsiniz.
        //mesela ekrana merhaba dünya yazan bir metot tazalım ve onu sürekli çağıralım.


        merhabaYaz(); //fonksiyon çağırma şekli
        merhabaYaz();
        merhabaYaz();
    }//ANA kısım burada bitiyor DUR

    // ya da burada

    public static void merhabaYaz(){
        System.out.println("fonksiyonda merhaba dünya");
        //metotlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
        //ve büyük programı parçalara
    }



}

