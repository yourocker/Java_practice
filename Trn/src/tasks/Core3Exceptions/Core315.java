package tasks.Core3Exceptions;

public class Core315 {
    public class MyNewException extends Exception {
        public MyNewException() {};
    }

    public void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
