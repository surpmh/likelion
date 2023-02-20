package _1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileOneLine {
    public String ReadLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str = reader.readLine();
        reader.close();
        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadFileOneLine readFileOneLine = new ReadFileOneLine();
        String str = readFileOneLine.ReadLine("./src/_1006/file/test_file.txt");

        System.out.println(str);
    }

}
