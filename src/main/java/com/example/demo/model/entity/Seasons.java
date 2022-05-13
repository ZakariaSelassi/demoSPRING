package com.example.demo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="seasons")
public class Seasons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSeasons")
    private int idSeasons;

    @Column(name="seasonsNumber")
    private int seasonsNumber;

    @ManyToOne()
    private Animes anime;

    @OneToMany(mappedBy = "seasons")
    private List<Episodes> episodesList;

    public Seasons(){}

    public Seasons(int idSeasons, int seasonsNumber, Animes anime, List<Episodes> episodesList) {
        this.idSeasons = idSeasons;
        this.seasonsNumber = seasonsNumber;
        this.anime = anime;
        this.episodesList = episodesList;
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

    public Animes getAnime() {
        return anime;
    }

    public void setAnime(Animes anime) {
        this.anime = anime;
    }

    public List<Episodes> getEpisodesList() {
        return episodesList;
    }

    public void setEpisodesList(List<Episodes> episodesList) {
        this.episodesList = episodesList;
    }
}
