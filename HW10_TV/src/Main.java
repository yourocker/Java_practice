public class Main {

    public static void main(String[] args) {

    TV samsung = new TV(1488, "Samsung");

    RemoteController samsungRC = new RemoteController("SamsungRC");

    samsungRC.setTV(samsung);

    Channel first = new Channel("первый", 1);

    TVShow sh1 = new TVShow("Новости", first);
    TVShow sh1 = new TVShow("Опять новости", first);
    TVShow sh1 = new TVShow("Вечерний чёрт", first);
    TVShow sh1 = new TVShow("Путин царь", first);
    }
}
