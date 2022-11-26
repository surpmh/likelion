package com.springboot.bbs.domain.dto;

import com.springboot.bbs.domain.entity.Hospital;
import com.springboot.bbs.domain.entity.Review;
import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HospitalReadResponse {
    private Long id;
    private String title;
    private String content;
    private String patientName;
    private String hospitalName;
}
