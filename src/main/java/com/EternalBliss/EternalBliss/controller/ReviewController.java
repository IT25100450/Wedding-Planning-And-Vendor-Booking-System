package com.EternalBliss.EternalBliss.controller;

import com.EternalBliss.EternalBliss.model.review;
import com.EternalBliss.EternalBliss.Service.reviewservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin("*")
public class ReviewController {

    @Autowired
    private reviewservice reviewService;

    @GetMapping
    public List<review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public review addReview(@RequestBody review review) {
        return reviewService.saveReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
}
