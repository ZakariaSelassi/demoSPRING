package com.example.demo.model.dto;

import com.example.demo.model.entity.Author;
import com.example.demo.model.enumFolder.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Set;

public class AnimesDTO {
    private int idAnimes;
    private String animeName;

    @JsonIgnore
    private Author author;

    private String AuthorName;

    private Set<Category> categories;
    private List<SeasonsDTO> seasons;
    private List<RatingDTO> Ratings;

    public AnimesDTO(){}

    public AnimesDTO(int idAnimes, String animeName, Author author) {
        this.idAnimes = idAnimes;
        this.animeName = animeName;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
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
        return Ratings;
    }

    public void setRatings(List<RatingDTO> ratings) {
        Ratings = ratings;
    }
}
