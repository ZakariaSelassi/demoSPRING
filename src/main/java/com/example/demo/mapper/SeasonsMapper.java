package com.example.demo.mapper;

import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.model.entity.Seasons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonsMapper {

    @Autowired
    private EpisodesMapper episodesMapper;
    public SeasonsDTO convertToDTO(Seasons seasons){

        if(seasons ==null) return null;

        SeasonsDTO dto = new SeasonsDTO();

        dto.setIdSeasons(seasons.getIdSeasons());
        dto.setSeasonsNumber(seasons.getSeasonsNumber());
        dto.setEpisodes(seasons.getEpisodesList()
                .stream().map(episodesMapper::convertToDTO).collect(Collectors.toList()));
        return dto;
    }

    public Seasons convertToEntity(SeasonsDTO seasonsDTO){
        if(seasonsDTO == null) return null;

        Seasons entity = new Seasons();

        entity.setIdSeasons(seasonsDTO.getIdSeasons());
        entity.setSeasonsNumber(seasonsDTO.getSeasonsNumber());
        entity.setEpisodesList(seasonsDTO.getEpisodes().stream()
                .map(episodesMapper::convertToEntity).collect(Collectors.toList()));
        return entity;
    }
}
