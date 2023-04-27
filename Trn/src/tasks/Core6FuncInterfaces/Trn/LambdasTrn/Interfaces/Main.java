package tasks.Core6FuncInterfaces.Trn.LambdasTrn.Interfaces;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Borat", 43);
        human.test2();
        System.out.println(human);
        Something.test(human);
        System.out.println(human);

        Function<String, String> function = String::toLowerCase;
        System.out.println(function.apply("BORAT"));

        Function<Human, Integer> function1 = Human::getAge;
        System.out.println(function1.apply(human));

        System.out.println("-------");

        IntSupplier supplier = () -> (int) (Math.random() * 100);
        System.out.println(supplier.getAsInt());

        IntFunction<String> function2 = String::valueOf;
        System.out.println(function2.apply(450));

        Supplier<String> supplier1 = String::new;
        System.out.println(supplier1);

         Something something = new Something() {
             @Override
             public void test2() {
                 System.out.println("Override something method");
             }
         };
        something.test2();
        something.test2();
    }
}
