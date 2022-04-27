import java.time.LocalTime;
import java.util.Scanner;

public class MainLegacy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        while (true) {
            System.out.println(message + " " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
            message = scanner.nextLine();
        }
    }
}
