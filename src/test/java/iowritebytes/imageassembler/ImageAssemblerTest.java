package iowritebytes.imageassembler;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ImageAssemblerTest {

    @TempDir
    public File folder;

    @Test
    public void testMakeImageFile() throws IOException {
        ImageAssembler imageAssembler = new ImageAssembler();

        byte[][] source = readImage();
        Path path = folder.toPath();

        imageAssembler.makeImageFile(source, path);

        byte[] original2 = Files.readAllBytes(Path.of("d:/training/training-solutions/src/main/resources/iowritebytes/imigeassembler/face_smile.png"));
        byte[] madeImage = Files.readAllBytes(path.resolve("image.png"));

        assertArrayEquals(original2, madeImage);
    }

    private byte[][] readImage() {
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream("d:/training/training-solutions/src/main/resources/iowritebytes/imigeassembler/face_smile.png"))) {
            ArrayList<byte[]> parts = new ArrayList<>();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                parts.add(Arrays.copyOf(buffer, length));
            }
            return parts.toArray(new byte[0][]);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot find source file., e");
        }
    }
}