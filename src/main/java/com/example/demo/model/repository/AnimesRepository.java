package com.example.demo.model.repository;

import com.example.demo.model.entity.Animes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimesRepository extends JpaRepository<Animes,Integer> {
}
