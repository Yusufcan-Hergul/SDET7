package gun38.polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Köpek kopek1=new Köpek("karabaş");
        Kedi kedi1=new Kedi("kopuk");

        Hayvan kopek2=new Hayvan("rodi");
        Hayvan kedi=new Hayvan("tekir");

        kopek1.ses();
        kopek1.kokladı();

        kopek2.ses();

        hayvanSes(kopek1);
        hayvanSes(kedi1);

    }

    public static void hayvanSes(Hayvan h){
        h.ses();
    }


}
