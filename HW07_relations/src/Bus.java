public class Bus {
    private final int MAX_PASSENGERS_COUNT = 3;

    private int number;
    private String model;
    private Driver driver;

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

    public void go(){
        if (driver != null) {
            System.out.println("Автобус " + model + " " + number +
                    " едет под управлением " + driver.getName() + " со стажем " +
                    driver.getExperience() + " лет");
            System.out.println("С нами едут:");
            for (int i = 0; i < passengersCount; i++) {
                System.out.println(passengers[i].getName());

            }
        } else {
            System.err.println("Автобус без водителя");
        }
    }

    public void setDriver(Driver driver) {
        if (this.driver == null) {
            this.driver = driver;
        } else {
            System.err.println("Автобус уже занят");
        }
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }
}
