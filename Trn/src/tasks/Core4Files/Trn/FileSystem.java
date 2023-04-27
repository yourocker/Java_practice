package tasks.Core4Files.Trn;
import java.io.*;
import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) throws IOException {
        File file = new File("src/kataacademy/Core4Files/test4.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        try(FileInputStream fin = new FileInputStream(file)) {
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
    }
}
