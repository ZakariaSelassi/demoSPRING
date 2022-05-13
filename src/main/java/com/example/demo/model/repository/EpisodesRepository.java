package com.example.demo.model.repository;

import com.example.demo.model.entity.Episodes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodesRepository extends JpaRepository<Episodes,Integer> {
}
