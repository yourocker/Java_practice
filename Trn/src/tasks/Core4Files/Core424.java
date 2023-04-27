package tasks.Core4Files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Core424 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{-1, 2, -1, 22});
        System.out.println(sumOfStream(inputStream));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int temp;

        while ((temp = inputStream.read()) != -1) {
            sum += (byte) temp;
        }
        return sum;
    }
}
