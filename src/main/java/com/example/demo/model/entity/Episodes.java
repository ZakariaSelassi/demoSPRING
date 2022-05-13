package com.example.demo.model.entity;

import javax.persistence.*;
import java.time.Duration;

@Entity
@Table(name="episodes")
public class Episodes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEpisode")
    private int idEpisode;

    @Column(name="titleEP")
    private String titleEP;

    @Column(name="duration")
    private Duration duration;

    @ManyToOne
    private Seasons seasons;

    public Episodes(){}

    public Episodes(int idEpisode, String titleEP, Duration duration, Seasons seasons) {
        this.idEpisode = idEpisode;
        this.titleEP = titleEP;
        this.duration = duration;
        this.seasons = seasons;
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

    public Seasons getSeasons() {
        return seasons;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }
}
