package tasks.Core2OOP;

public class Core228 {

    public static boolean isWeekend(String dayName) {
        return dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");
//
//        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
//            return true;
//        }
//        return false;
    }

    public static int weekendCount(String[] days) {
        int counter = 0;
        for (int i = 0; i < days.length; i++) {
            if (isWeekend(days[i]) == true) {
                counter++;
            }
        }
        return counter;
    }

    public static int weekdayCount(String[] days) {
        int counterWeekdays = days.length - weekendCount(days);
        return counterWeekdays;
    }

    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Friday", "Friday", "Saturday"};
        String dayName = "Monday";
        System.out.println(isWeekend(dayName));
        System.out.println(weekendCount(days));
        System.out.println(weekdayCount(days));
    }
}
