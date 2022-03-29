public class HumansPrinter {
    void print(Human[] humans) {
        System.out.printf("%22s|%10s|\n", "Имя", "Возраст ");
        for (int i = 0; i < humans.length; i++) {
            System.out.printf("%22s|%10s|\n", humans[i].name, humans[i].age);
        }
    }

    void print(int ages[]) {
        System.out.printf("%22s лет|%10s|\n", "Возраст", "Количество");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] != 0) {
                System.out.printf("%26s|%10d|\n", i, ages[i]);
            }
        }
    }
}
