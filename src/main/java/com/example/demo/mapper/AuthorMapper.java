package com.example.demo.mapper;

import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.model.entity.Author;
import com.example.demo.model.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorMapper {

    public AuthorDTO convertToDTO(Author author){
        if(author == null)return null;

        AuthorDTO dto = new AuthorDTO();

        dto.setIdAuthor(author.getIdAuthor());
        dto.setFirstName(author.getFirstName());
        dto.setLastName(author.getLastName());

        return dto;
    }

    public Author convertToEntity(AuthorDTO authorDTO){
        if(authorDTO == null) return null;

        Author entity = new Author();
        entity.setIdAuthor(authorDTO.getIdAuthor());
        entity.setFirstName(authorDTO.getFirstName());
        entity.setLastName(authorDTO.getLastName());
        return entity;
    }
}
