package gun42;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

public class ZONEDADTAT {
    public static void main(String[] args) {
        ZonedDateTime zdtlokal=ZonedDateTime.now();
        System.out.println("zdtlokal = " + zdtlokal);

        Set<String> zamanbolgeleri= ZoneId.getAvailableZoneIds();
        for (String z : zamanbolgeleri){
            if (z.toLowerCase().contains("lon"))
                System.out.println("z = " + z);
        }

        ZoneId zoneLON=ZoneId.of("Europe/London");
        ZonedDateTime zdtLON=ZonedDateTime.now(zoneLON);

        System.out.println("zdtLON = " + zdtLON);

        DateTimeFormatter gosterimSablonu=DateTimeFormatter.ofPattern("EEEE dd.MM.DD");
        System.out.println("gosterimSablonu = " + gosterimSablonu);
    }
}
