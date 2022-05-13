package com.example.demo.model.repository;

import com.example.demo.model.entity.Seasons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonsRepository extends JpaRepository<Seasons,Integer> {
}
