package com.EternalBliss.EternalBliss.Service;

import com.EternalBliss.EternalBliss.model.review;
import com.EternalBliss.EternalBliss.repository.reviewrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reviewservice {

    @Autowired
    private reviewrepo reviewRepository;

    public List<review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public review saveReview(review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
