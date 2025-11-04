import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CodeCounter {
    public static void main(String[] args) throws IOException {
        
        //Make sure a filename is provided
        if (args.length == 0) {
            System.out.println("Usage: java CodeCounter <filename>");
            return;
        }

        Path path = Paths.get(args[0]);
        List<String> lines = Files.readAllLines(path);

        int lineCount = lines.size();
        int wordCount = 0;
        int charCount = 0;

        for (String line : lines) {
            wordCount += line.trim().split("\\s+").length;
            charCount += line.length();
        }

        System.out.printf("Analyzing file: %s%n", args[0]);
        System.out.printf("Lines: %d%nWords: %d%nCharacters: %d%n", lineCount, wordCount, charCount);
    }
}
