public class Main {

    public static void main(String[] args) {

        HumansGenerator generator = new HumansGenerator();
        HumansStatistic statistic = new HumansStatistic();
        HumansPrinter printer = new HumansPrinter();

        Human[] humans = generator.generate(100, 120);

        printer.print(humans);

        int[] ages = statistic.calcAgesStatistic(humans, 120);

        printer.print(ages);
        }
    }
