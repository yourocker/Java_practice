package HW16_Annons_and_Lambdas.lambdas.example2;

public class Sequence {
    private int[] elements;

    public Sequence(int[] elements) {
        this.elements = elements;
    }

    public Sequence filter(FilterFunction filter) {
        int[] temp = new int[elements.length];

        int newElementsCount = 0;
        for (int i = 0; i < elements.length; i++) {
            if (filter.test(elements[i])) {
                temp[newElementsCount] = elements[i];
                newElementsCount++;
            }
        }

        int[] newElements = new int[newElementsCount];

        System.arraycopy(temp, 0, newElements, 0, newElementsCount);
        return new Sequence(newElements);
    }

    public Sequence map(MapFunction map) {
        int newElements[] = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = map.apply(elements[i]);
        }

        return new Sequence(newElements);
    }

    public void forEach(ConsumeFunction consume) {

        for (int i = 0; i < elements.length; i++) {
            consume.apply(elements[i]);
        }
    }
}