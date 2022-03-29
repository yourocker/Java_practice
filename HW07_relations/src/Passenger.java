public class Passenger {
    private String name;
    private boolean inBus;
    private Bus bus;

    public Passenger(String name) {
        this.name = name;
        this.inBus = false;
    }

    public boolean isInBus() {
        return inBus;
    }

    public String getName() {
        return name;
    }

    public void goToBus(Bus bus) {
        if (!inBus) {
            if (bus.getPassenger(this)) {
                inBus = true;
                this.bus = bus;
            }
        } else {
            System.err.println(name + " - Я уже еду в автобусе" + " " +
                    this.bus.getModel() + " " + this.bus.getNumber());
        }
    }
}

