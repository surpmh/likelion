package com.springboot.bbs.domain.dto;

import com.springboot.bbs.domain.entity.Hospital;
import com.springboot.bbs.domain.entity.Review;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HospitalReadResponse {
    private Long id;
    private String hospitalName;
    private String roadNameAddress;
    private List<ReviewReadResponse> reviews;

    public static HospitalReadResponse fromEntity(Hospital hospital) {
        return HospitalReadResponse.builder()
                .id(hospital.getId())
                .hospitalName(hospital.getHospitalName())
                .roadNameAddress(hospital.getRoadNameAddress())
                .reviews(hospital.getReviews().stream()
                        .map(review->ReviewReadResponse.fromEntity(review)).collect(Collectors.toList())) // review를 ReviewReadResponse로
                .build();
    }
}