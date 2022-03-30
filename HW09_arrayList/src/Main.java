public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(38);
        list.add(346);
        list.add(23);
        list.add(325);
        list.add(24);
        list.add(97);
        list.add(98);
        list.add(99);
        list.add(100);
        list.add(105);
        list.add(104);
        list.add(103);
        list.add(102);
        list.add(101);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + " = " + list.get(i));
        }
        System.out.println("\nArray size = " + list.size());
    }
}
