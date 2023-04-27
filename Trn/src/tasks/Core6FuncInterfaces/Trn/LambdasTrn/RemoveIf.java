package tasks.Core6FuncInterfaces.Trn.LambdasTrn;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Learn Java");
        al.add("Lambdas");

//        al.removeIf(element -> element.length() < 5);
        Predicate<String> p = element -> element.length() < 5;
        al.removeIf(p);
        System.out.println(al);
    }
}
