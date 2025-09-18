package EjerciciosResueltos.Two;

public class HotelReservation {
    public String guestName;
    public int numberOfNights;
    double dailyRate;
    boolean hasOceanView;
    int numberOfRooms;
    public HotelReservation(String guestName, int numberOfNights, double dailyRate, boolean hasOceanView, int numberOfRooms) {
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
        this.dailyRate = dailyRate;
        this.hasOceanView = hasOceanView;
        this.numberOfRooms = numberOfRooms;
    }
    public double  totalCost(){
        double totalCost =(numberOfNights*dailyRate);
        if (hasOceanView){
            totalCost += 20 * numberOfNights;
        }
        return totalCost;
    }
    public void showReservationDetails(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Ocean View: " + (hasOceanView ? "Yes" : "No"));
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Total Cost: $" + totalCost());
    }
}
