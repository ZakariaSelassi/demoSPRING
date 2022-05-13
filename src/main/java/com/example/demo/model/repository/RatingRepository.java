package com.example.demo.model.repository;

import com.example.demo.model.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer>{
}
