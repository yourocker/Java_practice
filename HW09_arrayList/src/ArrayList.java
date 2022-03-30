public class ArrayList {
    private static final int INITIAL_SIZE = 10;

    private int[] elements;
    private int size;

    public ArrayList() {
        this.elements = new int[INITIAL_SIZE];
        this.size = 0;
    }

    //добавляет элемент в конец списка
    public void add(int element) {
        if (isOverhead()) {
            int[] newElements = new int[elements.length + elements.length / 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            this.elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    private boolean isOverhead() {
        return size == elements.length;
    }

    //возвращает элемент по индексу
    public int get(int index) {
        if (indexInBounds(index)) {
            return elements[index];
        }
        System.err.println("Index out of bounds");
        return -1;
    }

    private boolean indexInBounds(int index) {
        return index >= 0 && index < size;
    }

    public int size() {
        return size;
    }
}
