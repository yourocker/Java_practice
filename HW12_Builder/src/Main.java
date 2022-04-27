public class Main {
    public static void main(String[] args) {
        User Yuriy = User.builder()
                .firstName("Yuriy")
                .lastName("Maryin")
                .age(34)
                .height(1.97)
                .isWorker(true)
                .build();
        User Leisan = User.builder()
                .firstName("Leisan")
                .build();
        User Volodya = User.builder()
                .firstName("Volodya")
                .lastName("Pupkin")
                .age(69)
                .build();
    }
}
