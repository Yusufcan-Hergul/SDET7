package gun42;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class localDataTaime {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());

        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println("dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        DateTimeFormatter ozelfortmat=DateTimeFormatter.ofPattern("dd.MM.yyyy.mm");
        System.out.println("ozelfortmat = " + ozelfortmat);
    }
}
