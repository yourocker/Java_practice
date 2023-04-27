package tasks.Core3Exceptions;

public class Core316 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        try {
            throw new Exception();
        } catch (Exception exception) {
            StackTraceElement[] stackTraceElements = exception.getStackTrace();
            if (stackTraceElements.length > 2) {
                return (stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName());
            } else {
                return null;
            }
        }
    }
}
