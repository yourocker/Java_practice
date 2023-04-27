package tasks.Core5GenericsAndCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Core5213 {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> temp = new HashSet<>();
        temp.addAll(set1);
        temp.addAll(set2);

        Iterator<T> iterator = temp.iterator();
        while (iterator.hasNext()) {
            T object = iterator.next();
            if (set1.contains(object) && set2.contains(object)) {
                iterator.remove();
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("2");

        System.out.println(symmetricDifference(set1, set2));
    }
}
