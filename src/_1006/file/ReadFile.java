package _1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/_1006/file/test_file.txt");
        
        int ch = reader.read();
        System.out.print((char) ch);
    }
}
