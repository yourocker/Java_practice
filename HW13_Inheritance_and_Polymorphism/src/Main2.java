public class Main2 {
    //POLYMORPHISM
    public static void main(String[] args) {
        Athlete athlete = new Athlete("Grafov", 30, 5);
        Human yourock = new Human("Yura", 34);
        Student sobaka = new Student("Dog", 17, 13.6);

        Human a1 = athlete;
        Human a2 = yourock;
        Human a3 = sobaka;

        Arena arena = new Arena();
        Human humans[] = {athlete, yourock, sobaka};

        arena.start(humans);
    }
}
