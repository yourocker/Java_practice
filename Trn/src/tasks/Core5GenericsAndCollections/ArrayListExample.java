package tasks.Core5GenericsAndCollections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("java.util.ArrayList<E> Example");
        ArrayList<String> listA = new ArrayList<>();

        listA.ensureCapacity(10);

        listA.add("a0");
        listA.add("a2");
        System.out.println("add at the and: " + listA);

        listA.add(1, "index1");
        System.out.println("add at the index 1: " + listA);

        System.out.print("Array elements: ");
        for (String el: listA) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Element of index 1: " + listA.get(1));

        System.out.println("Size of array: " + listA.size());

        listA.set(1, "newIndex");
        System.out.println("Array with new index at 1: " + listA);

        listA.remove(1);
        System.out.println(listA + " length: " + listA.size());
    }
}
