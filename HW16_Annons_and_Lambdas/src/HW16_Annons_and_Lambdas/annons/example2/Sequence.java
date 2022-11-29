package HW16_Annons_and_Lambdas.annons.example2;

public abstract class Sequence {

    protected int array[];

    public Sequence(int[] elements) {
        this.array = elements;
    }

    public abstract void sort();

    public abstract boolean search (int element);
}
