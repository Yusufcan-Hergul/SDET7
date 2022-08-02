package gun42;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTİME {
    public static void main(String[] args) throws InterruptedException {
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        DateTimeFormatter ozelformat1= DateTimeFormatter.ofPattern("hh.mm");
        System.out.println("ozelformat1 = " + ozelformat1);

        DateTimeFormatter ozelformat2=DateTimeFormatter.ofPattern("hh.mm.ss");
        while (true){
            saat=LocalTime.now();
            System.out.println("saat = " + saat.format(ozelformat2));

            Thread.sleep(1000);
        }

    }
}
