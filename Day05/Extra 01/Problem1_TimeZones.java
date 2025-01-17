
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Problem1_TimeZones {
    public static void main(String[] args) {
        System.out.println("Problem 1: Time Zones");

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT")); // Current time in GMT
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // Current time in IST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // Current time in PST

        System.out.println("GMT Time: " + gmtTime);
        System.out.println("IST Time: " + istTime);
        System.out.println("PST Time: " + pstTime);
    }
}
