package com.springboot.bbs.repository;

import com.springboot.bbs.domain.entity.Hospital;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HospitalRepositoryTest {

    @Autowired
    HospitalRepository hospitalRepository;

    public void printHospitalNameAndAddress(List<Hospital> hospitals) {
        for (var hospital : hospitals) {
            System.out.printf("%s | %s %f\n", hospital.getHospitalName(), hospital.getRoadNameAddress(), hospital.getTotalAreaSize());
        }

        System.out.println(hospitals.size());
    }

    @Test
    @DisplayName("BusinessTypeName이 보건소 보건지소 보건진료소인 데이터가 잘 나오는지 테스트")
    void findByBusinessTypeNameIn() {
        List<String> inClues = new ArrayList<>();
        inClues.add("보건소");
        inClues.add("보건지소");
        inClues.add("보건진료소");
        List<Hospital> hospitals = hospitalRepository.findByBusinessTypeNameIn(inClues);
        printHospitalNameAndAddress(hospitals);
    }

    @Test
    @DisplayName("HospitalName이 김내과인 데이터가 잘 나오는지 테스트")
    void findBy() {
        List<Hospital> hospitals = hospitalRepository.findByHospitalName("김내과");
        printHospitalNameAndAddress(hospitals);
    }

    @Test
    @DisplayName("RoadNameAddress이 서울 특별시 서초구로 시작하는 데이터가 잘 나오는지 테스트")
    void findByStartingWith() {
        List<Hospital> hospitals = hospitalRepository.findByRoadNameAddressStartingWith("서울특별시 서초구");
        printHospitalNameAndAddress(hospitals);
    }

    @Test
    @DisplayName("HospitalName에 한방과 신경이 포함된 데이터가 잘 나오는지 테스트")
    void findByLike() {
        List<Hospital> hospitals = hospitalRepository.findByHospitalNameLike("%한방%신경%");
        printHospitalNameAndAddress(hospitals);
    }

    @Test
    @DisplayName("TotalAreaSize가 10에서 100 사이인 데이터가 잘 나오는지 테스트")
    void between() {
        List<Hospital> hospitals = hospitalRepository.findByTotalAreaSizeBetween(10, 100);
        printHospitalNameAndAddress(hospitals);
    }

    @Test
    @DisplayName("경기도 수원시에 있는 병원을 TotalAreaSize 기준으로 오름차순이 잘 나오는지 테스트")
    void orderby() {
        List<Hospital> hospitals = hospitalRepository.findByRoadNameAddressContainingOrderByTotalAreaSize("경기도 수원시");
        printHospitalNameAndAddress(hospitals);
    }
}