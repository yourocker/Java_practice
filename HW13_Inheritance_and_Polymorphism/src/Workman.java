public class Workman extends Human{
    private int experience;

    public Workman(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void work() {
        System.out.println("Let`s ROCK!");
    }

    @Override
    public void sayName() {
        System.out.println("mra eht ma I");
    }
}
