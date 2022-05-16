package com.example.demo.services;

import com.example.demo.mapper.EpisodesMapper;
import com.example.demo.model.dto.EpisodesDTO;
import com.example.demo.model.entity.Episodes;
import com.example.demo.model.entity.Seasons;
import com.example.demo.model.repository.EpisodesRepository;
import com.example.demo.model.repository.SeasonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EpisodeService {

    @Autowired
    private EpisodesMapper episodesMapper;
    @Autowired
    private EpisodesRepository episodesRepository;

    @Autowired
    private SeasonsRepository seasonsRepository;


    public List<EpisodesDTO> findAll(){
        return episodesRepository.findAll()
                .stream().map(episodesMapper::convertToDTO).collect(Collectors.toList());
    }

    public EpisodesDTO save(EpisodesDTO episodesDTO , int idSeasons){
        Seasons seasonsWithID = seasonsRepository.getById(idSeasons); // id seasons
        Episodes newEpisodes =  episodesMapper.convertToEntity(episodesDTO);
        newEpisodes.setSeasons(seasonsWithID);
        return episodesMapper.convertToDTO(episodesRepository.save(newEpisodes));
    }
}
