package com.example.demo.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAuthor")
    private int idAuthor;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @OneToMany(mappedBy = "author")
    private List<Animes> animesList = new ArrayList<>();

    public Author(){}

    public Author(int idAuthor, String firstName, String lastName, List<Animes> animesList) {
        this.idAuthor = idAuthor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.animesList = animesList;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Animes> getAnimesList() {
        return animesList;
    }

    public void setAnimesList(List<Animes> animesList) {
        this.animesList = animesList;
    }
}
