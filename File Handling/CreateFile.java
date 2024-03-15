import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String fileName = "Hello.txt";
        String content = "Hola, Comos tas? sds";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            writer.newLine();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}