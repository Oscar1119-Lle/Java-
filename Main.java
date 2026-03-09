public class Main {
    public static void main(String[] args) {
        ERyder defaultBike = new ERyder();
        System.out.println("--- Default Constructor Bike ---");
        defaultBike.printBikeDetails();

        ERyder myBike = new ERyder("EB-2026-001", 60, true, 85.2);
        System.out.println("\n--- Parameterized Constructor Bike ---");
        myBike.ride();
        myBike.printBikeDetails();
    }
}
