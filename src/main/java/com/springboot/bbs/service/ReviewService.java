package com.springboot.bbs.service;

import com.springboot.bbs.domain.dto.ReviewCreateRequset;
import com.springboot.bbs.domain.dto.ReviewCreateResponse;
import com.springboot.bbs.domain.dto.ReviewReadResponse;
import com.springboot.bbs.domain.entity.Hospital;
import com.springboot.bbs.domain.entity.Review;
import com.springboot.bbs.repository.HospitalRepository;
import com.springboot.bbs.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    public ReviewCreateResponse add(ReviewCreateRequset reviewCreateRequset) {
        Optional<Hospital> hospital = hospitalRepository.findById(reviewCreateRequset.getHospitalId());
        Review review = Review.builder()
                .title(reviewCreateRequset.getTitle())
                .content(reviewCreateRequset.getContent())
                .userName(reviewCreateRequset.getContent())
                .hospital(hospital.get())
                .build();
        Review savedReview = reviewRepository.save(review);
        return new ReviewCreateResponse(savedReview.getId(), savedReview.getTitle(), savedReview.getContent(), savedReview.getContent(), "리뷰 등록이 성공 했습니다.");
    }

    public Review getReview(Long id) {
        Review review = reviewRepository.findById(id).orElseThrow(() -> new RuntimeException("해당 id가 없습니다."));
        return review;
    }

    public List<ReviewReadResponse> findAllByHospitalId(Long hospitalId) {
        Hospital hospital = hospitalRepository.findById(hospitalId)
                .orElseThrow(()-> new IllegalArgumentException("해당 id가 없습니다."));
        List<ReviewReadResponse> reviews = reviewRepository.findByHospital(hospital)
                .stream().map(review -> ReviewReadResponse.builder()
                        .title(review.getTitle())
                        .content(review.getContent())
                        .userName(review.getUserName())
                        .hospitalName(review.getHospital().getHospitalName())
                        .build()
                ).collect(Collectors.toList());

        return reviews;
    }
}
