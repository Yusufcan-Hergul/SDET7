package gun36.ornk;

public class Ordek extends  Hayvan{ //baba, babanın herşeyini miras aldı

    int kanatAcıklıgı;

    public Ordek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    public void konustu(){
        System.out.println("vak vak dedi");
    }


}
