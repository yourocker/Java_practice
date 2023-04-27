package tasks.Core2OOP;

public class Core217 {
    public enum Day {
        MONDAY(false, "понедельник"), TUESDAY(false, "вторник"),
        WEDNESDAY(false, "среда"), THURSDAY(false, "четверг"),
        FRIDAY(false, "пятница"), SATURDAY(true, "суббота"), SUNDAY(true, "воскресенье");

        private final String rus;
        private final boolean weekend;

        Day(boolean weekend, String rus) {
            this.rus = rus;
            this.weekend = weekend;
        }

        public boolean isWeekend() {
            return weekend;
        }

        public String getRusName() {
            return rus;
        }
    }

    public static void main(String[] args) {
        Day day = Day.SATURDAY;
        System.out.println(day.getRusName());
        System.out.println(day.isWeekend());
    }
}
