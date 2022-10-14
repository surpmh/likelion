package hospital;

import hospital.parser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController<T> {
    Parser<T> parser;
    boolean isRemoveColumnName = true;

    public FileController(Parser<T> parser) {
        this.parser = parser;
    }

    public FileController(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;

        if (isRemoveColumnName) {
            br.readLine();
        }

        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }

    public void creatANewFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        System.out.println("Have a file generated?:" + file.exists());
    }

    public void writeLines(List<String>  lines, String filename) {
        File file = new File(filename);
        String query = "INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n"+
                "VALUES\n";

        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));
            writer.write(query);
            for (String str : lines) {
                writer.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }
}
