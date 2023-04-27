package tasks.Core6FuncInterfaces.Trn.CatsLambda;

public interface Settable<C extends WithNameAndAge> {
    void set(C entity, String name, int age);
}
