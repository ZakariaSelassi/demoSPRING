package com.example.demo.model.dto;

import java.util.ArrayList;
import java.util.List;

public class SeasonsDTO {

    private int idSeasons;
    private int seasonsNumber;

    private List<EpisodesDTO> episodes = new ArrayList<>();


    public SeasonsDTO(){}

    public SeasonsDTO(int idSeasons, int seasonsNumber, AnimesDTO animes, List<EpisodesDTO> episodes) {
        this.idSeasons = idSeasons;
        this.seasonsNumber = seasonsNumber;

        this.episodes = episodes;
    }
    public int getIdSeasons() {
        return idSeasons;
    }

    public void setIdSeasons(int idSeasons) {
        this.idSeasons = idSeasons;
    }

    public int getSeasonsNumber() {
        return seasonsNumber;
    }

    public void setSeasonsNumber(int seasonsNumber) {
        this.seasonsNumber = seasonsNumber;
    }

    public List<EpisodesDTO> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodesDTO> episodes) {
        this.episodes = episodes;
    }
}
