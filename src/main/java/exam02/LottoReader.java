package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoReader {
    //private List<Integer> lottoNumbers = new ArrayList<>();
    private int[] lottoNumbers = new int[90];
    InputStream inputStream;

    public LottoReader(InputStream inputStream) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            int index = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineParts = line.split(";");
                for (int i = 11; i <= 15; i++) {

                    index = Integer.parseInt(lineParts[i]);
                    lottoNumbers[index - 1]++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }

    public int getNumber(int number) {
        return lottoNumbers[number - 1];
    }
 }
