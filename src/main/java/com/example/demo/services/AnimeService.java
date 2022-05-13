package com.example.demo.services;

import com.example.demo.mapper.AnimesMapper;
import com.example.demo.mapper.AuthorMapper;
import com.example.demo.mapper.SeasonsMapper;
import com.example.demo.model.dto.AnimesDTO;
import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.model.entity.Animes;
import com.example.demo.model.entity.Seasons;
import com.example.demo.model.repository.AnimesRepository;
import com.example.demo.model.repository.AuthorRepository;
import com.example.demo.model.repository.SeasonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeService {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private AnimesMapper animesMapper;
    @Autowired
    private AnimesRepository animesRepository;
    @Autowired
    private SeasonsMapper seasonsMapper;
    @Autowired
    private SeasonsRepository seasonsRepository;
    public List<AnimesDTO> findAll(){
        return animesRepository.findAll()
                .stream()
                .map(animesMapper::convertToDTO)
                .collect(Collectors.toList());
    }


    public AnimesDTO save(AnimesDTO anime, int authorID, int seasonsNum){
        SeasonsDTO seasonsId =seasonsMapper.convertToDTO(seasonsRepository.findById(seasonsNum).orElse(null));
        AuthorDTO authorWithID = authorMapper.convertToDTO(authorRepository.findById(authorID).orElse(null));
        anime.setAuthor(authorWithID);
        anime.setSeasons((List<SeasonsDTO>) seasonsId);
       return animesMapper.convertToDTO(animesRepository.save(animesMapper.convertToEntity(anime)));
    }

}
