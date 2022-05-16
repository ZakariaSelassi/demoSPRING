package com.example.demo.model.entity;

import com.example.demo.model.enumFolder.Category;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="animes")
public class Animes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAnimes")
    private int idAnimes;

    @Column(name="animeName")
    private String animeName;

    @Column(name="dateBegin")
    private Instant dateBegin;

    @Column(name="dateEnd")
    private Instant dateEnd;

    @ManyToOne()
    private Author author;

    @OneToMany(mappedBy = "anime",  fetch = FetchType.LAZY)
    private List<Seasons> seasonsList = new ArrayList<>();

    @OneToMany(mappedBy = "animeRating", fetch = FetchType.LAZY)
    private List<Rating> ratingList = new ArrayList<>();

    @ElementCollection(targetClass = Category.class)
    @CollectionTable(name="anime_categorie", joinColumns = @JoinColumn(name="idAnimes"))
    @Enumerated(EnumType.STRING)
    @Column(name="title")
    private Set<Category> categorySet;

    public Animes(){}

    public Animes(int idAnimes, Instant dateBegin, Instant dateEnd, Author author, List<Seasons> seasonsList, List<Rating> ratingList, Set<Category> categorySet) {
        this.idAnimes = idAnimes;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.author = author;
        this.seasonsList = seasonsList;
        this.ratingList = ratingList;
        this.categorySet = categorySet;
    }

    public int getIdAnimes() {
        return idAnimes;
    }

    public void setIdAnimes(int idAnimes) {
        this.idAnimes = idAnimes;
    }


    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public Instant getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Instant dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Instant getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Instant dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Seasons> getSeasonsList() {
        return seasonsList;
    }

    public void setSeasonsList(List<Seasons> seasonsList) {
        this.seasonsList = seasonsList;
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

    public Set<Category> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<Category> categorySet) {
        this.categorySet = categorySet;
    }
}
