package day_05_03_2024.zadanie_30;

import day_05_03_2024.zadanie_30.objects.ReverserFile;

import java.io.IOException;
import java.nio.file.Path;

public class Main {


    public static void main(String[] args) throws IOException {
        test();
    }


    public static void test() throws IOException {
        ReverserFile reverserFile = new ReverserFile(Path.of("resources/abc.txt"));
        reverserFile.reverse();
        reverserFile.makeNewFile();
    }
}
