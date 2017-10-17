package reservations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reservation implements Reservationy {
    String name;
    String day;

    public Reservation() {
        name = getCodeBooking();
        day = getDowBooking();
    }

    @Override
    public String getDowBooking() {
        List<String> days = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
        int i = (int) (Math.random() * (days.size()));
        return days.get(i);
    }

    @Override
    public String getCodeBooking() {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int k = (int) (Math.random() * abc.length());
            sb.append(abc.charAt(k));
        }
        return sb.toString();
    }
}
