package com.springboot.bbs.controller;

import com.springboot.bbs.domain.dto.HospitalResponse;
import com.springboot.bbs.domain.dto.ReviewCreateRequset;
import com.springboot.bbs.domain.dto.ReviewCreateResponse;
import com.springboot.bbs.service.HospitalService;
import com.springboot.bbs.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hospitals")
@Slf4j
public class HospitalRestController {

    private final HospitalService hospitalService;
    private final ReviewService reviewService;

    public HospitalRestController(HospitalService hospitalService, ReviewService reviewService) {
        this.hospitalService = hospitalService;
        this.reviewService = reviewService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HospitalResponse> get(@PathVariable Integer id) {
        HospitalResponse hospitalResponse = hospitalService.getHospital(id);
        return ResponseEntity.ok().body(hospitalResponse);  // Return은 DTO
    }

    @PostMapping("/{id}/reviews")
    public ResponseEntity<ReviewCreateResponse> get(@PathVariable Integer id, @RequestBody ReviewCreateRequset reviewCreateRequset) {
        return ResponseEntity.ok().body(reviewService.add(reviewCreateRequset));
    }
}
