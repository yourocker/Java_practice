package tasks.Core6FuncInterfaces.Trn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "не", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май", "смерть"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort((o1, o2) -> o2.length - o1.length);

//        arrays.sort((o1, o2) -> {
//            int length1 = 0;
//            int length2 = 0;
//            for (String s : o1) {
//                length1 += s.length();
//            }
//            for (String s : o2) {
//                length2 += s.length();
//            }
//            return length1 - length2;
//        });

        System.out.println(Arrays.toString(arrays.get(0)));
        System.out.println(Arrays.toString(arrays.get(1)));
        System.out.println(Arrays.toString(arrays.get(2)));

    }
}
