package com.example.demo.services;

import com.example.demo.mapper.AnimesMapper;
import com.example.demo.mapper.SeasonsMapper;
import com.example.demo.model.dto.AnimesDTO;
import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.model.entity.Animes;
import com.example.demo.model.entity.Seasons;
import com.example.demo.model.repository.AnimesRepository;
import com.example.demo.model.repository.SeasonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeasonsService {

    @Autowired
    private SeasonsMapper seasonsMapper;
    @Autowired
    private SeasonsRepository seasonsRepository;

    @Autowired
    private AnimesMapper animesMapper;
    @Autowired
    private AnimesRepository animesRepository;
    public List<SeasonsDTO> findAll(){
        return seasonsRepository.findAll()
                .stream()
                .map(seasonsMapper::convertToDTO)
                .collect(Collectors.toList());
    }

    public SeasonsDTO save(SeasonsDTO seasonsDTO,int animeID){
        // Recuperer l'id après avoir crée l'anime afin d'avoir un anime dans la seasons ??
        Animes animeWithID = animesRepository.getById(animeID);
        Seasons newSeasons = seasonsMapper.convertToEntity(seasonsDTO);
        newSeasons.setAnime(animeWithID);
        return seasonsMapper.convertToDTO(seasonsRepository.save(newSeasons));

    }
}
