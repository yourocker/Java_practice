package tasks.Core6FuncInterfaces.Trn.LambdasTrn.Interfaces;

public interface Something {
    static int test(Human human) {
        human.age += human.age;
        System.out.println(human.age);
        return human.age;
    }

    default void test2() {
        System.out.println("Test2 OK");
    }
}
