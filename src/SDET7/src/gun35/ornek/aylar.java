package gun35.ornek;

public enum aylar {
    OCAK(1, 31, "ocak"),
    SUBAT(2, 30, "subat"),
    MART(3, 30, "mart"),
    NISAN(4, 31, "nisan"),
    MAYIS(5, 30, "mayıs"),
    HAZIRAN(6, 31, "haziran"),

    TEMMUZ(7, 31, "temmuz"),
    AGUSTOS(8, 31, "agustos"),
    EYLUL(9, 31, "eylul"),
    EKİM(10, 31, "ekim"),
    KASIM(11, 31, "kasim"),
    ARALIK(12, 31, "aralık");

    int ayNo;
    int gunMiktar;
    String isim;

    aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }
}
