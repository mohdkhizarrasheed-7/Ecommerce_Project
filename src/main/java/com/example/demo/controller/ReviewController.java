package com.example.demo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Review;
import com.example.demo.service.ReviewService;


@RestController
@RequestMapping("/api/reviews")
@CrossOrigin("*")
public class ReviewController {

    private final ReviewService service;

    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @PostMapping
    public Review add(@RequestBody Review review) {
        return service.add(review);
    }

    @GetMapping("/{productId}")
    public List<Review> get(@PathVariable Long productId) {
        return service.getByProduct(productId);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Review deleted successfully";
    }

    @GetMapping("/average/{productId}")
    public Double average(@PathVariable Long productId) {
        return service.average(productId);
    }
}
