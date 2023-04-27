package tasks.Core1Base;

public class Core169 {
public static boolean isPalindrome(String text) {
    text = text.replaceAll("[^a-zA-Z0-9]", "");
    StringBuffer stringBuffer = new StringBuffer(text).reverse();
    return (text.equalsIgnoreCase(String.valueOf(stringBuffer))) ? true : false;
}

    public static void main(String[] args) {
        System.out.println(isPalindrome("zalupap   ulaz"));
    }
}
