package com.example.demo;

import com.example.demo.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	public UsersRepository usersRepository;
	@Autowired
	public AnimesRepository animesRepository;
	@Autowired
	public AuthorRepository authorRepository;
	@Autowired
	public SeasonsRepository seasonsRepository;
	@Autowired
	public EpisodesRepository episodesRepository;
	@Autowired
	public RatingRepository ratingRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
