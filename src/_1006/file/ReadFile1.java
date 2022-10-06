package _1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/_1006/file/test_file.txt");
        
        int ch = reader.read();
        System.out.print((char) ch);
    }
}
