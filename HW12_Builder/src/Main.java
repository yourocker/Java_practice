public class Main {
    public static void main(String[] args) {
        //User Yuriy = new User("Yuriy", "Maryin", 34, 1.97, true);
        User Yuriy = User.builder()
                .firstName("Yuriy")
                .lastName("Maryin")
                .age(34)
                .height(1.97)
                .isWorker(true)
                .build();
        //User Leisan = new User("Leisan", null, 0, 0.0, true);
        User Leisan = User.builder()
                .firstName("Leisan")
                .build();
        //User Volodya = new User("Volodya", "Pupkin",0,0.0,false);
        User Volodya = User.builder()
                .firstName("Volodya")
                .lastName("Huylo")
                .age(69)
                .build();
    }
}
