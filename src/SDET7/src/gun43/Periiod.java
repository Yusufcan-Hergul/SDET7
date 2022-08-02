package gun43;

import gun42.LocalDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Periiod {
    public static void main(String[] args) {
        LocalTime geceyarısı=LocalTime.of(0,0);
        LocalTime ogrevakti=LocalTime.of(13,3,2);

        Duration fark=Duration.between(geceyarısı,ogrevakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());

        LocalDateTime from=LocalDateTime.of(2020,10,4,10,20);
        LocalDateTime to=LocalDateTime.of(2020,11,15,11,21);

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman = " + farkZaman.toDays());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());
        System.out.println("farkZaman = " + farkZaman.getNano());
    }
}
