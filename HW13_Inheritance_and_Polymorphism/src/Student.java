public class Student extends Human {
    private double averageMark;

    public Student(String name, int age, double averageMark) {
        super(name, age);
        this.averageMark = averageMark;
    }

    @Override
    public void run() {
        System.out.println(name + " run");
        this.stepsCount += 5;
    }

    public double getAverageMark() {
        return averageMark;
    }
}
