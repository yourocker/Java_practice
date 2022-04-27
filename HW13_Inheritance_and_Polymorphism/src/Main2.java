public class Main2 {
    //POLYMORPHISM
    public static void main(String[] args) {
        Athlete athlete = new Athlete("Grafov", 30, 5);
        Workman yourock = new Workman("Yura", 34, 18);
        Student sobaka = new Student("Dog", 17, 13.6);
        Workman boris = new Workman("Boris", 99, 90);

        Human a1 = athlete;
        Human a2 = yourock;
        Human a3 = sobaka;

        boris.work();
        boris.sayName();

        Arena arena = new Arena();
        Human humans[] = {athlete, yourock, sobaka};

        arena.start(humans);
    }
}
