public class Workman extends Human implements Worker {
    private int experience;

    public Workman(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void work() {
        System.out.println("Let`s ROCK!");
    }

    @Override
    public void getSalary() {
        System.out.println("Give me my cash!!!");
    }

    @Override
    public void sayName() {
        System.out.println("mra eht ma I");
    }
}
