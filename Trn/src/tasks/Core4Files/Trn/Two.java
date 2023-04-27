package tasks.Core4Files.Trn;

import java.io.*;

public class Two {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int temp;
        while((temp = inputStream.read()) != -1) {
            if (temp % 2 == 0) {
                outputStream.write(temp);
                System.out.println(temp);
            }
        }
        outputStream.flush();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("src/kataacademy/Core4Files/test4.txt");
        File file1 = new File("src/kataacademy/Core4files/test5.txt");
        System.out.println(file.createNewFile());
        System.out.println(file1.createNewFile());
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] bytes = new byte[] {3, 10, 4, 5, 7};
            fos.write(bytes);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (InputStream inputStream = new FileInputStream(file); FileOutputStream outputStream = new FileOutputStream(file1)) {
            print(inputStream, outputStream);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
