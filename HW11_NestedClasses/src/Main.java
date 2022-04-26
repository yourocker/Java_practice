public class Main {

    public static void main(String[] args) {
	    Table table = new Table();
        table.put("yourock", 34);
        table.put("leisan", 30);
        table.put("volodya", 69);
        table.put("petya", 11);
        table.put("sanya", 17);

        Table.Iterator iterator1 = table.new Iterator();

        while (iterator1.hasNext()) {
            Table.TableEntry entry = iterator1.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
