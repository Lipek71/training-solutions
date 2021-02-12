package week13.d04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class TemplateEngine {

    public void merge(BufferedReader reader, Map<String, String> template, BufferedWriter writer) throws IOException {
        try (reader) {
            String line = "";
            String lineOut = "";
            while ((line = reader.readLine()) != null) {
                String[] lineParts = line.split(" ");
                for (String linePart : lineParts) {
                    if (linePart.startsWith("{")) {
                        linePart = template.get(linePart.substring(1, linePart.length() - 1));
                        lineOut += linePart + " ";
                    } else {
                        lineOut += linePart + " ";
                    }

                }
                writer.write(lineOut);
                writer.newLine();
                lineOut = "";
            }
        }
    }


    public static void main(String[] args) throws IOException {
        TemplateEngine templateEngine = new TemplateEngine();
        Map<String, String> template = Map.of("nev", "Lipek",
                "datum", LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE),
                "osszeg", new StringBuilder("150 500").toString(),
                "hatarido", LocalDate.of(2021, 4, 1).format(DateTimeFormatter.ISO_LOCAL_DATE));

        BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of("src/main/java/week13/d04/input.txt")));
        BufferedWriter writer = new BufferedWriter(Files.newBufferedWriter(Path.of("src/main/java/week13/d04/output.txt"), StandardOpenOption.APPEND));
        try (writer){
            templateEngine.merge(reader, template, writer);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open!", ioe);
        }
    }
}
