public class Bus {
    private final int MAX_PASSENGERS_COUNT = 3;

    private int number;
    private String model;

    private Passenger[] passengers;
    private int passengersCount;

    public Bus(int number, String model) {
        this.number = number;
        this.model = model;
        this.passengers = new Passenger[MAX_PASSENGERS_COUNT ];
        this.passengersCount = 0;
    }

    public boolean getPassenger (Passenger passenger) {
        if (passengersCount < MAX_PASSENGERS_COUNT) {
            passengers[passengersCount] = passenger;
            passengersCount++;
            return true;
        } else {
            System.err.println("Автобус заполнен");
            return false;
        }
    }
}
