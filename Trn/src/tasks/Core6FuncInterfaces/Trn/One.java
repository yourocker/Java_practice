package tasks.Core6FuncInterfaces.Trn;

import java.util.*;

public class One {
    public static class DoubleHolder implements Comparable<DoubleHolder> {
        double d;

        public DoubleHolder(double d) {
            this.d = d;
        }

        @Override
        public int compareTo(DoubleHolder o) {
            return Double.compare(d, o.d);
        }

        @Override
        public String toString() {
            return String.valueOf(d);
        }
    }

    public static void main(String[] args) {
        List<DoubleHolder> data = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            data.add(new DoubleHolder(i));
        }
        data.add(new DoubleHolder(Double.NaN));

        for (int i = 0; i < 10; i++) {
            Collections.shuffle(data);
            Collections.sort(data);
            System.out.println(data);
        }

        Set<DoubleHolder> set = new TreeSet<>();
        for (int i = 0; i < 50; i++) {
            set.add(new DoubleHolder(i % 10 == 0 ? Double.NaN : i % 10));
        }
        System.out.println(set);
    }
}
