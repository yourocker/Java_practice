package tasks.Core5GenericsAndCollections;

import java.util.Objects;

public class Core5114 {
    public static class Pair<T1, T2> {
        private T1 value1;
        private T2 value2;

        private Pair(T1 value1, T2 value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public T1 getFirst() {
            return value1;
        }

        public T2 getSecond() {
            return value2;
        }

        public static <T1, T2> Pair<T1, T2> of(T1 t1, T2 t2) {
            return new Pair<>(t1, t2);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value1, value2);
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }
}
