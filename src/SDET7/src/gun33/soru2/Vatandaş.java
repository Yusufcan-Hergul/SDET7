package gun33.soru2;

public class Vatandaş {
    String isim;

    final int tcNo;

    static int tcNosayac=1001;

    public Vatandaş(String isim){
        this.isim=isim;
        this.tcNo=++tcNosayac;

    }

    @Override
    public String toString() {
        return "Vatandaş{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
