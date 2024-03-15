import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Read {
    public static void main(String[] args) {
        String fileName = "Hello.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
