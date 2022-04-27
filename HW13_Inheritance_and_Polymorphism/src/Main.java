public class Main {

    public static void main(String[] args) {
        Athlete athlete = new Athlete("Grafov", 30, 5);
        Human yourock = new Human("Yura", 34);
        Student sobaka = new Student("Dog", 17, 13.6);

        athlete.go();
        yourock.go();
        sobaka.go();

        yourock.run();
        sobaka.run();
        athlete.run();

        System.out.println(athlete.getStepsCount());
        System.out.println(yourock.getStepsCount());
    }
}
