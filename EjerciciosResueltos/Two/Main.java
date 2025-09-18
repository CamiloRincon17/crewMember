package EjerciciosResueltos.Two;

public class Main {
    public static void main(String[] args) {
        HotelReservation reservation1 = new HotelReservation("John Doe", 3, 150.00, true, 2);
        HotelReservation reservation2 = new HotelReservation("Alice Smith", 5, 120.00, false, 1);
        reservation1.showReservationDetails();
        reservation2.showReservationDetails();
    }
}
