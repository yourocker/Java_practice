package tasks.Core4Files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class tests {
    public static void main(String[] args) throws IOException {
        byte b = -3;
        byte[] bytes = {b};
        InputStream in = new ByteArrayInputStream(bytes);
        int i = in.read();
        System.out.println(i);
    }
}
