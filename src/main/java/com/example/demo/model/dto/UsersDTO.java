package com.example.demo.model.dto;

import java.util.List;

public class UsersDTO {
    private int id;
    private String name;

    private List<RatingDTO> ratings;

    public UsersDTO(){}
    public UsersDTO(int id, String name, List<RatingDTO> ratings) {
        this.id = id;
        this.name = name;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RatingDTO> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingDTO> ratings) {
        this.ratings = ratings;
    }
}
