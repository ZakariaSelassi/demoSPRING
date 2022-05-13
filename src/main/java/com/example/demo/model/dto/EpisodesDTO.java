package com.example.demo.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Duration;

public class EpisodesDTO {

    private int idEpisode;
    private String titleEP;
    private Duration duration;

    public EpisodesDTO(){}

    public EpisodesDTO(int idEpisode, String titleEP, Duration duration) {
        this.idEpisode = idEpisode;
        this.titleEP = titleEP;
        this.duration = duration;
    }

    public int getIdEpisode() {
        return idEpisode;
    }

    public void setIdEpisode(int idEpisode) {
        this.idEpisode = idEpisode;
    }

    public String getTitleEP() {
        return titleEP;
    }

    public void setTitleEP(String titleEP) {
        this.titleEP = titleEP;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
