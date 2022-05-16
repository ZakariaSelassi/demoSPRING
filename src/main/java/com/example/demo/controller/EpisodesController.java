package com.example.demo.controller;

import com.example.demo.model.dto.EpisodesDTO;
import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.model.repository.EpisodesRepository;
import com.example.demo.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/episodes")
public class EpisodesController {

    @Autowired
    private EpisodeService episodeService;


    @GetMapping
    public List<EpisodesDTO> findAll(){
        return episodeService.findAll();
    }

    @PostMapping("{seasonsID}")
    public EpisodesDTO save(@RequestBody EpisodesDTO episodesDTO,@PathVariable int seasonsID){
        return episodeService.save(episodesDTO,seasonsID);
    }
}
