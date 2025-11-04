import java.io.*;
import java.nio.file.*;
import java.util.*;

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

        for (String line : lines) {
            wordCount += line.trim().split("\\s+").length;
        }

        System.out.printf("Analyzing file: %s%n", args[0]);
        System.out.printf("Lines: %d%nWords: %d%n", lineCount, wordCount);
    }
}
