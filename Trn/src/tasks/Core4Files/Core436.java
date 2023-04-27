package tasks.Core4Files;

import java.io.*;
import java.nio.charset.Charset;

public class Core436 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        Charset charset = Charset.forName("ASCII");
        System.out.println(readAsString(inputStream, charset));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter sw = new StringWriter();
        int temp;
        while ((temp = reader.read()) != -1) {
            sw.write(temp);
        }
        return sw.toString();
    }
}
