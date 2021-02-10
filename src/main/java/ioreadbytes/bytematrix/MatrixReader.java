package ioreadbytes.bytematrix;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {
    List<byte[]> myMatrix = new ArrayList<>();
    byte[] bytes = new byte[1000];

    public void readBytesAndCreateMatrix(String file) {
        try (InputStream is = new BufferedInputStream(Files.newInputStream(Path.of("src/main/resources/matrix.dat")))) {
            while ((bytes = is.readNBytes(1000)).length > 0){
                myMatrix.add(bytes);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't open the file!", ioe);
        }
    }

    public int  numberOfColumnsWhereMoreZeros(){
        int numOfColumns = 0;
        for (int i = 0; i < 1000; i++) {
            int zeros = 0;
            int ones = 0;

            for (int j = 0; j < myMatrix.size(); j++) {

                if (myMatrix.get(j)[i] == 48) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (zeros > ones) {
                numOfColumns++;
            }
        }

        return numOfColumns;
    }

    public List<byte[]> getMyMatrix() {
        return myMatrix;
    }

    public static void main(String[] args) {
        MatrixReader matrixReader = new MatrixReader();
        matrixReader.readBytesAndCreateMatrix("m");
    }
}
