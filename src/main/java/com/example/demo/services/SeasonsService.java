package com.example.demo.services;

import com.example.demo.mapper.SeasonsMapper;
import com.example.demo.model.dto.SeasonsDTO;
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
    public List<SeasonsDTO> findAll(){
        return seasonsRepository.findAll()
                .stream()
                .map(seasonsMapper::convertToDTO)
                .collect(Collectors.toList());
    }

    public SeasonsDTO save(SeasonsDTO seasonsDTO){
        return seasonsMapper.convertToDTO(seasonsRepository.save(seasonsMapper.convertToEntity(seasonsDTO)));
    }
}
