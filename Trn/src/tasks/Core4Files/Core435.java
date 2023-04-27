package tasks.Core4Files;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Core435 {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
        writer.write("собака");
        writer.flush();
        System.out.println(System.out);
    }
}
