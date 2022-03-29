public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus(55, "Nefaz");

        Passenger volodya = new Passenger("Володя");
        Passenger petya = new Passenger("Петя");
        Passenger alesha = new Passenger("Алёша");
        Passenger kesha = new Passenger("Иннокентий");

        volodya.goToBus(bus);
        petya.goToBus(bus);
        alesha.goToBus(bus);
        kesha.goToBus(bus);

        System.out.println(volodya.isInBus());
        System.out.println(kesha.isInBus());
    }
}
