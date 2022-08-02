package gun43.soru;

import gun41.soru.Kartal;

public class AnımalMain {
    public static void main(String[] args) {
        At at=new At();
        at.eats();
        at.liveİn();
        at.name();
        at.takeCare();
        at.walks();

        Domestic at2=new At();
        at2.name();
        at2.takeCare();
        at2.liveİn();
        at2.walks();
        System.out.println("------------");
        Anımal kartal=new kartal();
        kartal.eats();
        kartal.liveİn();
        kartal.walks();
    }
}
