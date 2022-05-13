package com.example.demo.services;

import com.example.demo.mapper.AuthorMapper;
import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.model.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private AuthorRepository authorRepository;
    public List<AuthorDTO> findAll(){
        return authorRepository.findAll()
                .stream()
                .map(authorMapper::convertToDTO)
                .collect(Collectors.toList());
    }

    public AuthorDTO save(AuthorDTO authorDTO){

        return authorMapper.convertToDTO(
                authorRepository.save(authorMapper.convertToEntity(authorDTO)));
    }
}
