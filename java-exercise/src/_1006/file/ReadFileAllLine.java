package _1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAllLine {
    public String ReadAllLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String strs = "";
        String str;
        while ((str = reader.readLine()) != null) {
            strs += str + '\n';
        }
        reader.close();
        return strs;
    }

    public static void main(String[] args) throws IOException {
        ReadFileAllLine readFileAllLine = new ReadFileAllLine();
        String str = readFileAllLine.ReadAllLine("./src/_1006/file/test_file.txt");

        System.out.println(str);
    }
}
