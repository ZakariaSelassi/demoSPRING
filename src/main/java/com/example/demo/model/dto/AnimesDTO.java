package com.example.demo.model.dto;

import com.example.demo.model.entity.Author;
import com.example.demo.model.enumFolder.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnimesDTO {
    private int idAnimes;
    private String animeName;

    private Instant dateBegin;

    private Instant dateEnd;

    @JsonIgnore
    private AuthorDTO author;

    private String authorName;

    private Set<Category> categories = new HashSet<>();
    private List<SeasonsDTO> seasons = new ArrayList<>();
    private List<RatingDTO> ratings = new ArrayList<>();

    public AnimesDTO(){}

    public AnimesDTO(int idAnimes, String animeName, Instant dateBegin, Instant dateEnd, AuthorDTO author, String authorName, Set<Category> categories, List<SeasonsDTO> seasons, List<RatingDTO> ratings) {
        this.idAnimes = idAnimes;
        this.animeName = animeName;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.author = author;
        this.authorName = authorName;
        this.categories = categories;
        this.seasons = seasons;
        this.ratings = ratings;
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

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public String getAuthorName() {
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public List<SeasonsDTO> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<SeasonsDTO> seasons) {
        this.seasons = seasons;
    }

    public List<RatingDTO> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingDTO> ratings) {
        this.ratings = ratings;
    }
}
