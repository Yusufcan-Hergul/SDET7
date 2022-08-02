package gun33;

import javax.sql.rowset.serial.SerialStruct;

public class Ogrenci {

    String ad;

    String soyad;

    static String okulAdı="ortaokul";

    public Ogrenci(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
