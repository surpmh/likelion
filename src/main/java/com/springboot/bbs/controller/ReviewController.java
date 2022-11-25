package com.springboot.bbs.controller;

import com.springboot.bbs.domain.dto.HospitalReadResponse;
import com.springboot.bbs.domain.dto.ReviewReadResponse;
import com.springboot.bbs.domain.entity.Review;
import com.springboot.bbs.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
@Slf4j
@RequiredArgsConstructor    // 필요한 argument를 넣어줌
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/{id}")
    public ResponseEntity<ReviewReadResponse> get(@PathVariable Long id) {
        Review review = reviewService.getReview(id);
        ReviewReadResponse response = ReviewReadResponse.fromEntity(review);
        return ResponseEntity.ok().body(response);
    }
}
