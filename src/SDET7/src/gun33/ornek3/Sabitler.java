package gun33.ornek3;

public class Sabitler {


    final static int birGundekiSaatsayısı=24;
    final static int birSaattekiDakikasayısı=60;
    final static int birDakikadakiSaniyesayısı=60;


public static int hesapla(int gun, int saat, int dak){
    int toplamSaniye=
            gun*Sabitler.birGundekiSaatsayısı * Sabitler.birDakikadakiSaniyesayısı
                    *Sabitler.birSaattekiDakikasayısı + saat * Sabitler.birSaattekiDakikasayısı * Sabitler.birDakikadakiSaniyesayısı +
                    dak * Sabitler.birDakikadakiSaniyesayısı;
    return toplamSaniye;

}
}
