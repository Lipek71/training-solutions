package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void writeLongWords(Writer writer, List<String> words){

        PrintWriter printWriter = new PrintWriter(writer);
        for(String word : words){
            printWriter.print(word);
            printWriter.print(":");
            printWriter.println(word.length());
        }
    }


    public LongWordService() {
    }

    public String writeWithStringWriter(List<String> words){
        try(StringWriter stringWriter = new StringWriter()){
            writeLongWords(stringWriter,words);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new IllegalStateException("Can't write!",e);
        }
    }

}
