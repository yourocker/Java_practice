public class Human  {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;
    private static final String DEFAULT_NAME = "DEFAULT_NAME";
    private static final int STEP_VALUE_FOR_GO = 1;
    private static final int STEP_VALUE_FOR_RUN = 10;

    protected String name;
    protected int age;

    protected int stepsCount;

    public Human(String name, int age) {
        if (name == null) {
            this.name = DEFAULT_NAME;
        } else {
            this.name = name;
        }

        if (age <= MAX_AGE && age >= MIN_AGE) {
            this.age = age;
        } else {
            this.age = MIN_AGE;
        }

        this.stepsCount = 0;
    }

    public void go() {
        System.out.println(name + " walk");
        this.stepsCount += STEP_VALUE_FOR_GO;
    }

    public void run() {
        System.out.println(name + " run");
        this.stepsCount += STEP_VALUE_FOR_RUN;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStepsCount() {
        return stepsCount;
    }
}
