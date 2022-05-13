package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name="rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRating")
    private int idRating;

    @Column(name="ratingNumber")
    private int ratingNumber;

    @ManyToOne()
    private Animes animeRating;

    @ManyToOne()
    private Users users;


    public Rating(){}

    public Rating(int idRating, int ratingNumber, Animes animeRating, Users users) {
        this.idRating = idRating;
        this.ratingNumber = ratingNumber;
        this.animeRating = animeRating;
        this.users = users;
    }

    public int getIdRating() {
        return idRating;
    }

    public void setIdRating(int idRating) {
        this.idRating = idRating;
    }

    public int getRatingNumber() {
        return ratingNumber;
    }

    public void setRatingNumber(int ratingNumber) {
        this.ratingNumber = ratingNumber;
    }

    public Animes getAnimeRating() {
        return animeRating;
    }

    public void setAnimeRating(Animes animeRating) {
        this.animeRating = animeRating;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
