public class Main {
    public static void main(String[] args) {
        ERyder bike1 = new ERyder("B001", 85, true, 12.5f);
        ERyder bike2 = new ERyder("B002", 60, false, 7.2f, "student123", 9876543210L);
        bike1.printRideDetails(20);
        bike2.printRideDetails(10);
        System.out.println("Private methods calculateFare can't be used directly, we can use another method to call it.");
        System.out.println("Total fare: " + bike2.getTotalFare());
    }
}
