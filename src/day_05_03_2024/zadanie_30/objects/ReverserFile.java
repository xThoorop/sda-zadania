package day_05_03_2024.zadanie_30.objects;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;

public class ReverserFile {


    private Path path;

    private List<String> contest;
    public ReverserFile(Path path) throws IOException {
        this.path = path;
        this.contest = Files.readAllLines(path);
    }




    public void reverse() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (String s : contest){
            sb.append(s);
            sb.append("\n");
        }
        sb.reverse();
        contest = Arrays.stream(sb.toString().split("\n")).toList();
    }

    public List<String> getContest() {
        return contest;
    }

    public void makeReversedFile() throws IOException {
        String[] nameAndEnlargment = path.getFileName().toString().split("\\.");//nazwa i rozszerzenie
        String filename = nameAndEnlargment[0];
        StringBuilder sb = new StringBuilder();
        sb.append(filename);
        sb.reverse();
        Path newPath = Path.of(path.toString().replace(filename,sb.toString()));
        Files.write(newPath,contest);

    }
}
