public class Main {

    public static void main(String[] args) {
        Driver anatoly = new Driver("Анатолий", 30);
        Driver viktor = new Driver("Виктор", 10);

        Bus bus55 = new Bus(55, "Nefaz");
        Bus bus22 = new Bus(22, "Ford ");

        Passenger volodya = new Passenger("Володя");
        Passenger petya = new Passenger("Петя");
        Passenger alesha = new Passenger("Алёша");
        Passenger kesha = new Passenger("Иннокентий");
        Passenger ignat = new Passenger("Игнат");
        Passenger grigory = new Passenger("Григорий");

        volodya.goToBus(bus55);
        petya.goToBus(bus55);
        alesha.goToBus(bus55);
        kesha.goToBus(bus55);

        ignat.goToBus(bus22);
        grigory.goToBus(bus22);

        volodya.goToBus(bus22);

        viktor.setBus(bus22);
        anatoly.setBus(bus55);

        viktor.drive();
        anatoly.drive();
    }
}

