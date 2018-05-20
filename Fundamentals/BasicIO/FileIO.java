import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class FileIO {
    public static void main(String[] args) {

        String inputFile = "./input.txt";
        String outputFile = "./output.txt";

        writeFile(outputFile, readFile(inputFile));

    }
    private static String readFile(String fileName) {

        String line;
        StringBuilder sb;
        String fileContents = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            sb = new StringBuilder();
            line = bufferedReader.readLine().toLowerCase();

            while(line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = bufferedReader.readLine();
                if(line == null) break;
                else line = line.toLowerCase();
            }
            fileContents = sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            line = null;
            sb = null;
        }
        return fileContents;
    }

    private static void writeFile(String fileName, String content) {

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "utf-8"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
