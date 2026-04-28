package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Review;

public interface ReviewService {

    Review add(Review review);

    List<Review> getByProduct(Long productId);

    void delete(Long id);

    Double average(Long productId);
}
