package _1006.file;

import java.io.File;

public class CurrentDirectory {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }

        /*
        출력 결과
        ./out
        ./.gitignore
        ./.git
        ./java-exercise.iml
        ./.idea
        ./src
         */
    }
}
