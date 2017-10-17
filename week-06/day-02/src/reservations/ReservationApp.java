package reservations;

import java.util.ArrayList;

public class ReservationApp extends ArrayList<Reservation>{
    ArrayList<Reservation> bookings;

    public ReservationApp() {
        this.bookings = new ArrayList<>();
    }

    public void makeReservation(){
        this.bookings.add(new Reservation());
    }

    public void print(){
        for (int i = 0; i < this.bookings.size(); i++) {
            System.out.println(String.format("Booking# %s for %s", this.bookings.get(i).name, this.bookings.get(i).day));
        }
    }

    public static void main(String[] args) {
        ReservationApp one = new ReservationApp();
        for (int i = 0; i < 8; i++) {
            one.makeReservation();
        }
        one.print();
    }

}
