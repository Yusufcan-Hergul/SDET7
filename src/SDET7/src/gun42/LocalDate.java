package gun42;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDate { public static void main(String[] args) {

    java.time.LocalDate tarih= java.time.LocalDate.now();

    System.out.println("tarih = " + tarih.getDayOfMonth());
    System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
    System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
    System.out.println("tarih = " + tarih);
    System.out.println("tarih.getYear() = " + tarih.getYear());

    System.out.println("tarih.format(DateTimeFormatter.BASIC_ISO_DATE) = " + tarih.format(DateTimeFormatter.BASIC_ISO_DATE));
    System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
    System.out.println("tarih = " + tarih.format(DateTimeFormatter.ISO_LOCAL_DATE));

    System.out.println("tarih.format(DateTimeFormatter.ISO_OFFSET_DATE) = " + tarih.format(DateTimeFormatter.ISO_OFFSET_DATE));
    System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.CHINA)));


    DateTimeFormatter ozelformat=DateTimeFormatter.ofPattern("dd/NM/yy");
    System.out.println("ozelformat = " + ozelformat);
}}
