package hospital;

import hospital.domain.Hospital;
import hospital.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileController<Hospital> hospitalLineReader = new FileController<>(new HospitalParser());
//        String filename = "./서울시 병의원 위치 정보.csv";
//        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

//        System.out.println(hospitals.size());
//        for (Hospital hospital : hospitals) {
//            System.out.printf("%s %s %s %s %d %s %s\n", hospital.getId(), hospital.getAddress(), hospital.getDistrict(), hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(), hospital.getSubdivision());
//        }
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String filename = "./서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);

        System.out.println(hospitals.size());
        List<String> lines = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            lines.add(hospital.getSqlInsertQuery());
        }

        String sqlFilename = "seoul_hostpital_insert.sql";
        hospitalFileController.creatANewFile(sqlFilename);
        hospitalFileController.writeLines(lines, sqlFilename);
    }
}
