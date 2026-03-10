public class ERyder {
    private static final String COMPANY_NAME = "ERyder";
    private static final double BASE_FARE = 1.0;
    private static final double PER_MINUTE_FARE = 0.5;
    
    private final String LINKED_ACCOUNT;
    private final long LINKED_PHONE_NUMBER;

    private String bikeID;
    private int batteryLevel;
    private boolean isAvailable;
    private float kmDriven;

    private int usageInMinutes;
    private double totalFare;

    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, float kmDriven) {
        this.bikeID = bikeID;
        this.batteryLevel = batteryLevel;
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
        LINKED_ACCOUNT = "greetg";
        LINKED_PHONE_NUMBER = 1234567;
    }

    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, float kmDriven,
                  String linkedAccount, long linkedPhoneNumber) {
        this.bikeID = bikeID;
        this.batteryLevel = batteryLevel;
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
        LINKED_ACCOUNT = linkedAccount;
        LINKED_PHONE_NUMBER = linkedPhoneNumber;
    }

    public void printRideDetails(int usageInMinutes) {
        this.usageInMinutes = usageInMinutes;
        System.out.println("The linked account is " + LINKED_ACCOUNT + ".");
        System.out.println("The linked phone number is " + LINKED_PHONE_NUMBER + ".");
        System.out.println("The bike ID is " + bikeID + ".");
        System.out.println("The usage in minutes is " + usageInMinutes + ".");
        System.out.println("The total fare is " + calculateFare(usageInMinutes) + ".\n");
    }
    private double calculateFare(int usageInMinutes) {
        this.totalFare = BASE_FARE + (PER_MINUTE_FARE * usageInMinutes);
        return this.totalFare;
    }
    public double getTotalFare() {
        return calculateFare(usageInMinutes);
    }
    public String getBikeID() {
        return bikeID;
    }
    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }
    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level! Must be between 0 and 100.");
            this.batteryLevel = 0;
        }
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
    public double getKmDriven() {
        return kmDriven;
    }
    public void setKmDriven(float kmDriven) {
        this.kmDriven = kmDriven;
    }

}