package iowritebytes.imageassembler;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] imageParts, Path filePath) {
        Path file = filePath.resolve("image.png");
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (byte[] imagePart : imageParts) {
                bufferedOutputStream.write(imagePart);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't write the output!", ioe);
        }
    }

    public static void main(String[] args) {
        ImageAssembler imageAssembler = new ImageAssembler();
        imageAssembler.makeImageFile(null, Path.of("src/main/resources/"));
    }
}
