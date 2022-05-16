package com.example.demo.mapper;

import com.example.demo.model.dto.EpisodesDTO;
import com.example.demo.model.entity.Episodes;
import org.springframework.stereotype.Service;

@Service
public class EpisodesMapper {

    public EpisodesDTO convertToDTO(Episodes episodes){
        if(episodes == null)return null;

        EpisodesDTO dto = new EpisodesDTO();

        dto.setIdEpisode(episodes.getIdEpisode());
        dto.setTitleEP(episodes.getTitleEP());
        dto.setDuration(episodes.getDuration());

        return dto;
    }

    public Episodes convertToEntity(EpisodesDTO episodesDTO){
        if(episodesDTO == null) return null;

        Episodes entity = new Episodes();
        entity.setIdEpisode(episodesDTO.getIdEpisode());
        entity.setTitleEP(episodesDTO.getTitleEP());
        entity.setDuration(episodesDTO.getDuration());
        return entity;
    }
}
