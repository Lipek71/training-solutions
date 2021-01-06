package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LottoReader {
    //private List<Integer> lottoNumbers = new ArrayList<>();
    private int[] lottoNumbers = new int[90];
    InputStream inputStream;

    public LottoReader(InputStream inputStream) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            String line;
            line = bufferedReader.readLine();
            int index=0;
            while((line = bufferedReader.readLine()) != null){
                String[] lineParts = line.split(";");
                for (int i=11; i <= 15; i++){
                    index = Integer.parseInt(lineParts[i]);
                    lottoNumbers[index-1]++;
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }

    public int getNumber(int number){
        return lottoNumbers[number-1];
    }

    public static void main(String[] args) {
        InputStream inputStream = LottoReader.class.getResourceAsStream("/otos.csv");

        LottoReader lottoReader = new LottoReader(inputStream);

    }
}
