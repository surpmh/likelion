package com.springboot.bbs.controller;

import com.springboot.bbs.domain.dto.*;
import com.springboot.bbs.domain.entity.Review;
import com.springboot.bbs.service.HospitalService;
import com.springboot.bbs.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospitals")
@Slf4j
@RequiredArgsConstructor
public class HospitalRestController {

    private final HospitalService hospitalService;
    private final ReviewService reviewService;

    @GetMapping("/{id}")
    public ResponseEntity<ReviewReadResponse> get(@PathVariable Long id) {
        Review review = reviewService.getReview(id);
        ReviewReadResponse response = ReviewReadResponse.fromEntity(review);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/{id}/reviews")
    public ResponseEntity<ReviewCreateResponse> get(@PathVariable Integer id, @RequestBody ReviewCreateRequset reviewCreateRequset) {
        return ResponseEntity.ok().body(reviewService.add(reviewCreateRequset));
    }

    @GetMapping("/{hospitalId}/reviews")
    public ResponseEntity<List<ReviewReadResponse>> reviews(@PathVariable Long hospitalId) {
        return ResponseEntity.ok().body(reviewService.findAllByHospitalId(hospitalId));
    }
}
