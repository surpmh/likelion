package _1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public void readByChar(String filename) throws IOException {
        FileReader reader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length()<1000000) {
            char c = (char)reader.read();
            fileContents += c;
        }
        reader.close();
        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine1(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    public void readByLine2(String filename) throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        String[] dataList = data.split(",");
        int fromCity = Integer.parseInt(dataList[0]);
        int toCity = Integer.parseInt(dataList[1]);
        return new PopulationMove(fromCity, toCity);
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromCity() + "," + populationMove.getToCity() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromCity() + "," + pm.getToCity();
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String address = "./src/_1007/from_to.txt";
        PopulationStatistics populationsStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationsStatistics.readByLine1(address);

        Map<String, Integer> map = populationsStatistics.getMoveCntMap(pml);
        System.out.println(map);

//        System.out.println(pml.size());
//        for (PopulationMove pm : pml) {
//            System.out.println("전입: " + pm.getToCity() + " 전출: " + pm.getFromCity());
//        }

//        List<String> strings = new ArrayList<>();
//
//        for (PopulationMove pm : pml) {
//            String fromTo = populationsStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//        System.out.println(strings.size());
//        populationsStatistics.write(strings,"./src/_1007/population/from_to.txt");
    }
}