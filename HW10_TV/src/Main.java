public class Main {

    public static void main(String[] args) {

    TV samsung = new TV(1488, "Samsung");

    RemoteController samsungRC = new RemoteController("SamsungRC");

    samsungRC.setTV(samsung);

    Channel chList = new Channel();

    chList.addCh(1);
    chList.addCh(2);
    chList.addCh(3);
    chList.addCh(4);
    chList.addCh(5);
    chList.addCh(6);
    chList.addCh(7);
    chList.addCh(8);
    chList.addCh(9);
    chList.addCh(10);
    chList.addCh(11);
    }
}
