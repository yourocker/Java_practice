public class Main {

    public static void main(String[] args) {
        //add array
        ArrayList list = new ArrayList();
        //add array values
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //check the add to begin
        list.addToBegin(5);
        list.add(10);
        list.add(7);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(10);
        list.add(13);
        list.add(10);
        list.add(15);
        list.add(16);
        //check the adding to begin
        list.addToBegin(101);

        //print the elements of array
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " = " + list.get(i));
        }

        //print the array size
        System.out.println("\nArray size = " + list.size());

        //print the first index of the given element
        System.out.println("\nFirst index of element = " + list.firstIndexOf(101));

        //print the last index of the given element
        System.out.println("\nLast index of element = " + list.lastIndexOf(5));

        //remove all given elements
        list.removeAll(10);
        //print result
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " = " + list.get(i));
        }

        //remove the given element
        list.remove(10);
        //print result
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " = " + list.get(i));
        }
    }
}
