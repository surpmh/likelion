package _1012.context;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class LineReader {
    List<String> readLines(String filename) throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = br.readLine()) != null) {
            result.add(str);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String filename = "./서울시 병의원 위치 정보.csv";
        LineReader lr = new LineReader();
        List<String> lines = lr.readLines(filename);
        System.out.println(lines.size());
    }
}
