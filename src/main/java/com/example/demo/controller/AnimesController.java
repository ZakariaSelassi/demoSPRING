package com.example.demo.controller;

import com.example.demo.model.dto.AnimesDTO;
import com.example.demo.model.repository.AnimesRepository;
import com.example.demo.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimesController {
    @Autowired
    private AnimesRepository animesRepository;
    @Autowired
    private AnimeService animeService;


    @GetMapping
    public List<AnimesDTO> findAll(){
        List<AnimesDTO> animes = animeService.findAll();
        return animes;
    }

    @PostMapping
    public AnimesDTO save(@RequestBody AnimesDTO animesDTO, @RequestParam MultiValueMap <int , int> authorId,seasonsId){
        System.out.println("From postman : " +  animesDTO.getAuthor());
        return animeService.save(animesDTO,authorId,seasonsId);
    }
}
