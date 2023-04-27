package tasks.Core5GenericsAndCollections;

public class Core5115 {
    public static class DynamicArray<T> {
        private T[] elements;
        private int size;

        public DynamicArray() {
            this.elements = (T[]) new Object[10];
        }

        //проверка на некорректный индекс
        private int isIndexExist(int index) {
            if (index >= size || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return index;
        }


        private T[] increaseCapacity() {
            T[] temp = (T[]) new Object[(elements.length * 2)];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            return temp;
        }

        public T get(int index) {
            isIndexExist(index);
            return elements[index];
        }

        public void remove(int index) {
            isIndexExist(index);
            T[] temp = elements;
            elements = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, elements, 0, index);
            System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
            size--;
        }

        public void add(T el) {
            if (size == elements.length) {
                elements = increaseCapacity();
            }
            elements[size] = el;
            size++;
        }
    }

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(7);
        array.remove(7);
        array.remove(7);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        for (int i = 0; i < array.size; i++) {
            System.out.print(array.get(i));
        }
    }
}
