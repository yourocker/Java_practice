public class HumansStatistic {
    int[] calcAgesStatistic(Human[] humans, int maxAge ) {
        int ages[] = new int[maxAge];

        for (int i = 0; i < humans.length; i++) {
            int currentAge = humans[i].getAge();
            ages[currentAge]++;
        }

        return ages;
    }
}
