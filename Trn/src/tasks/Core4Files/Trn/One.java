package tasks.Core4Files.Trn;

import java.io.*;

public class One {
    public static int sumOfStream (InputStream inputStream) throws IOException {
        int temp;
        int sum = 0;
        while ((temp = inputStream.read()) != -1) {
            sum += (byte) temp;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("src/kataacademy/Core4Files/test4.txt");
        file.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] bytes = new byte[] {1, 2, 4, 11};
            fos.write(bytes);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (InputStream inputStream = new FileInputStream(file)) {
            System.out.println(sumOfStream(inputStream));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
