package gun27;

import java.util.HashMap;
import java.util.Map;

public class javaMap2 {
    public static void main(String[] args) {
        // bir kartvizit uygulamasını 2 kişi için yapınız.

        Map<String, String> nKartvizit=new HashMap<>();
        nKartvizit.put("isim","Nazmiye");
        nKartvizit.put("emaıl","nazmiye@gmail.com");
        nKartvizit.put("adres","tr");
        nKartvizit.put("telefon","654363465");

        System.out.println("nKartvizit = " + nKartvizit.get("isim"));
        System.out.println("nKartvizit.get(\"\") = " + nKartvizit.get("telefon"));
        
        Map<String, String> kKartvizit=new HashMap<>();
        nKartvizit.put("isim","Kadir");
        nKartvizit.put("emaıl","kadir@gmail.com");
        nKartvizit.put("adres","almanya");
        nKartvizit.put("telefon","654363465");

        Map<String, Map<String, String>> kartDefteri=new HashMap<>();
        kartDefteri.put("nazmiye", nKartvizit); //nazmiye anahtarına nazmiyenin kartvizitini atadı
        kartDefteri.put("kadir",kKartvizit);

        System.out.println("kartDefteri.get(\"Kadir\").get(\"telefon\") = " + kartDefteri.get("Kadir").get("telefon"));


        
    }
}
