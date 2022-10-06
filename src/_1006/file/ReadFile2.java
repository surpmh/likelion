package _1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/_1006/file/test_file.txt");
        int ch1 = reader.read();
        System.out.print((char) ch1);
        int ch2 = reader.read();
        System.out.print((char) ch2);
    }
}
