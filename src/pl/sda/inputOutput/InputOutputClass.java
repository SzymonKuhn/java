package pl.sda.inputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputOutputClass {
    public static void main(String[] args) {
        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("Base folfer: " + baseFolder);

        try {
            if (!Files.exists(baseFolder)) {
                Files.createDirectories(baseFolder);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("text.txt");

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.toString(), true);
            fileWriter.write("Szymon Kuhn");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
