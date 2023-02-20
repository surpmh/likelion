package _1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public char ReadAChar(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        return (char) reader.read();
    }

    public String ReadTwoChars(String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        String str = "";
        str += (char) reader.read();
        str += (char) reader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        char ch1 = readFile.ReadAChar("./src/_1006/file/test_file.txt");
        String ch2 = readFile.ReadTwoChars("./src/_1006/file/test_file.txt");

        System.out.print(ch1);
        System.out.println(ch2);
    }
}