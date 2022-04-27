public class Athlete extends Human {
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

    public int getRank() {
        return rank;
    }
}
