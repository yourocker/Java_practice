package HW16_Annons_and_Lambdas.annons.example2;

public class Main {
    public static void main(String[] args) {
        int elements[] = {2, 2, 1, 5, 6, 10, 11};

        Sequence sequence = new Sequence(elements) {

            @Override
            public void sort() {
                int min;
                int indexOfMin;
                int temp;

                for (int i = 0; i < args.length; i++) {
                    min = array[i];
                    indexOfMin = i;

                    for (int j = 0; j < array.length; j++) {
                        if (array[j] < min) {
                            min = array[j];
                            indexOfMin = j;
                        }
                    }

                    temp = array[i];
                    array[i] = min;
                    array[indexOfMin] = temp;
                    System.out.println(array);
                }
            }

            @Override
            public boolean search(int element) {
                int left;
                int right;
                int middle;

                left = 0;
                right = array.length - 1;
                middle = left + (right -  left) / 2;

                boolean isExist = false;

                while (left <= right) {
                    if (array[middle] < element) {
                        left = middle + 1;
                        middle = left + (right - left) / 2;
                    } else if (array[middle] > element) {
                        right = middle - 1;
                        middle = left + (right - left) / 2;
                    } else if (array[middle] == element) {
                        isExist = true;
                        break;
                    }
                }

                return isExist;
            }
        };

        sequence.sort();
        System.out.println(sequence.search(11));
    }
}