package _1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileN {
    public String ReadNChars(int n, String filename) throws IOException {
        FileReader reader = new FileReader(filename);
        String str = "";

        for (int i=0; i<n; i++) {
            int asciiCode = reader.read();
            if (asciiCode == -1) {
                return str;
            }
            str += (char) asciiCode;
        }

        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadFileN readFileN = new ReadFileN();
        String str = readFileN.ReadNChars(5, "./src/_1006/file/test_file.txt");

        System.out.println(str);
    }
}
