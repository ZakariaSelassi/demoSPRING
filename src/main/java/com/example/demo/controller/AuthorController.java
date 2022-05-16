package com.example.demo.controller;

import com.example.demo.model.dto.AuthorDTO;
import com.example.demo.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")

public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @CrossOrigin
    @GetMapping
    public List<AuthorDTO> findAll(){
        return authorService.findAll();
    }
    @CrossOrigin
    @PostMapping
    public AuthorDTO save(@RequestBody AuthorDTO authorDTO){
        System.out.println(authorDTO.getFirstName());
        return authorService.save(authorDTO);
    }

    @CrossOrigin
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        return authorService.delete(id);
    }

}
