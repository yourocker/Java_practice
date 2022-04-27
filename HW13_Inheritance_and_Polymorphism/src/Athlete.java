public class Athlete extends Human implements Worker, Beneficiary {
    private static final int ATHLETE_STEP_VALUE_FOR_RUN = 20;
    private static final int DEFAULT_RANK = 0;

    private int rank;

    public Athlete(String name, int age, int rank) {
        super(name, age);

        this.stepsCount = 0;

        if (rank >= DEFAULT_RANK) {
            this.rank = rank;
        } else {
            this.rank = DEFAULT_RANK;
        }
    }

    @Override
    public void run() {
        System.out.println(name + " run");
        this.stepsCount += ATHLETE_STEP_VALUE_FOR_RUN;
    }

    @Override
    public void sayName() {
        System.out.println("I am very strong, my name is " + name);
    }

    @Override
    public void work() {
        System.out.println("Running is my work");
    }

    @Override
    public void getSalary() {
        System.out.println("Give me my money!");
    }

    @Override
    public void getBenefit() {
        System.out.println("Fuck this shit! I have a discount!!! ");
    }

    public int getRank() {
        return rank;
    }
}
