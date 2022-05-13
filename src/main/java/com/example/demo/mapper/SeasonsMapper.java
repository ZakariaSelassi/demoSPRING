package com.example.demo.mapper;

import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.model.entity.Seasons;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonsMapper {

    public SeasonsDTO convertToDTO(Seasons seasons){

        if(seasons ==null) return null;

        SeasonsDTO dto = new SeasonsDTO();

        dto.setIdSeasons(seasons.getIdSeasons());
        dto.setSeasonsNumber(seasons.getSeasonsNumber());
        return dto;
    }

    public Seasons convertToEntity(SeasonsDTO seasonsDTO){
        if(seasonsDTO == null) return null;

        Seasons entity = new Seasons();

        entity.setIdSeasons(seasonsDTO.getIdSeasons());
        entity.setSeasonsNumber(seasonsDTO.getSeasonsNumber());

        return entity;
    }
}
