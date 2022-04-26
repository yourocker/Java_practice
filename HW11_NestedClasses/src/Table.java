public class Table {
    // static nested class
    public static class TableEntry {
        private String key;
        private int value;

        public TableEntry(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

    public class Iterator {
        private int current = 0;
        public TableEntry next() {
            TableEntry entry = entries[current];
            current++;
            return entry;
        }

        public boolean hasNext() {
            return current < count;
        }
    }

    private static final int MAX_ENTRIES_COUNT = 11;

    private TableEntry entries[];
    private int count;

    public Table() {
        this.entries = new TableEntry[MAX_ENTRIES_COUNT];
        this.count = 0;
    }

    public void put (String key, int value) {
        entries[count] = new TableEntry(key, value);
        count++;
    }

    public int get (String key) {
        for (int i = 0; i < count; i++) {
            if(entries[i].key.equals(key)) {
                return entries[i].value;
            }
        }
        return -1;
    }
}
