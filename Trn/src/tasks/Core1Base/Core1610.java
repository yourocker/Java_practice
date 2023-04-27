package tasks.Core1Base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Core1610 {
    public static boolean isGmailOrOutlook(String email) {
        Pattern splitter = Pattern.compile("[@]");
        String[] splitStr = splitter.split(email);
        if (splitStr[1].equals("gmail.com") || splitStr[1].equals("outlool.com")) {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }

    public static void main(String[] args) {
        String email = "@gmail.com";
        System.out.println(isGmailOrOutlook(email));
    }
}
