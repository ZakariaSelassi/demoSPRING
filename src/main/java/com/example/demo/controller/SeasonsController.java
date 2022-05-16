package com.example.demo.controller;


import com.example.demo.model.dto.SeasonsDTO;
import com.example.demo.services.SeasonsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seasons")
public class SeasonsController {

    @Autowired
    private SeasonsService seasonsService;

    @GetMapping
    public List<SeasonsDTO> findAll(){
        return seasonsService.findAll();
    }

    @PostMapping("{animeID}")
    public SeasonsDTO save(@RequestBody SeasonsDTO seasonsDTO, @PathVariable int animeID){
        System.out.println("from postman season : " + animeID);
        return seasonsService.save(seasonsDTO,animeID);
    }



}
