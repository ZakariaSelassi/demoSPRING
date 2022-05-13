package com.example.demo.mapper;

import com.example.demo.model.dto.AnimesDTO;
import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.model.dto.RatingDTO;
import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.model.entity.Animes;
import com.example.demo.model.entity.Seasons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimesMapper {
    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private SeasonsMapper seasonsMapper;
    public AnimesDTO convertToDTO(Animes animes){
       if(animes == null)return null;
       AnimesDTO dto = new AnimesDTO();
       dto.setIdAnimes(animes.getIdAnimes());
       dto.setAnimeName(animes.getAnimeName());
       dto.setDateBegin(animes.getDateBegin());
       dto.setDateEnd(animes.getDateEnd());
       dto.setAuthor(authorMapper.convertToDTO(animes.getAuthor()));
       dto.setCategories(animes.getCategorySet());
       dto.setSeasons((List<SeasonsDTO>) seasonsMapper.convertToDTO((Seasons) animes.getSeasonsList()));
       List<RatingDTO> rat = new ArrayList<>();
       dto.setRatings(rat);
       return dto;
    }

    public Animes convertToEntity(AnimesDTO animesDTO){
        if(animesDTO == null)return null;

        Animes entity = new Animes();

        entity.setIdAnimes(animesDTO.getIdAnimes());
        entity.setAnimeName(animesDTO.getAnimeName());
        entity.setDateBegin(animesDTO.getDateBegin());
        entity.setDateEnd(animesDTO.getDateEnd());
        entity.setAuthor(authorMapper.convertToEntity(animesDTO.getAuthor()));
        entity.setSeasonsList((List<Seasons>) authorMapper.convertToEntity((AuthorDTO) animesDTO.getSeasons()));
        entity.setCategorySet(animesDTO.getCategories());

        return entity;

    }
}
