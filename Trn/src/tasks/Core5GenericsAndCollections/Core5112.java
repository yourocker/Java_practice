package tasks.Core5GenericsAndCollections;

public class Core5112 {
public static class Box<T> {
    private T object;

    public static <T> Box<T> getBox() {
        return new Box<>();
    }
}

    public static void main(String[] args) {


    }
}
