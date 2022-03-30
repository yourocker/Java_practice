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

    //добавляет элемент в начало списка addToBegin(9) = 6 7 8 -> 9 6 7 8
    public void addToBegin(int element) {
        int[] shiftElements = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            shiftElements[i + 1] = elements[i];
        }
        this.elements = shiftElements;
        elements[0] = element;
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

    // удаляет элемент в заданном индексе
    public void remove(int index) {
        int[] cropElements = new int[elements.length - 1];
        for (int i = 0; i < index; i++) {
            cropElements[i] = elements[i];
        }
        for (int i = index; i < elements.length - 1; i++) {
            cropElements[i] = elements[i + 1];
        }
        this.elements = cropElements;
        size--;
    }

    // удаляет все вхождения элемента
    public void removeAll(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) {
                remove(i);
            }
        }
    }

    // Возвращает индекс искомого элемента (первый) 9 6 7 6 -> indexOf(6) -> 0
    public int firstIndexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) {
                return i;
            }
        }
        System.err.println("Not found :(");
        return -1;
    }

    // Возвращает индекс искомого элемента (последний) 9 6 7 6 -> indexOf(6) -> 3
    public int lastIndexOf(int element) {
        for (int i = elements.length - 1; i > 0; i--) {
            if (element == elements[i]) {
                return i;
            }
        }
        System.err.println("Not found :(");
        return -1;
    }

    private boolean indexInBounds(int index) {
        return index >= 0 && index < size;
    }

    public int size() {
        return size;
    }
}
