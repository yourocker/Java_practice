package tasks.Core4Files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Core425 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{-1, 2, 3, -1, 22});
        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }
        };
        print(inputStream, outputStream);
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int temp;
        while ((temp = inputStream.read()) != -1) {
            if (temp % 2 == 0) {
//                System.out.println(temp);
                outputStream.write(temp);
            }
        }
        outputStream.flush();
//        System.out.println(outputStream);
    }
}
