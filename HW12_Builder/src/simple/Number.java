package simple;

public class Number {
    private int value;

    public Number() {
        this.value = 0;
    }

    public Number plus(int value) {
        this.value += value;
        return this;
    }

    public Number minus(int value) {
        this.value -= value;
        return this;
    }

    public int getValue() {
        return value;
    }
}
