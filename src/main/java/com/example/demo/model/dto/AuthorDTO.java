package com.example.demo.model.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AuthorDTO {

    private int idAuthor;
    private String firstName;
    private String lastName;

    public AuthorDTO(){}

    public AuthorDTO(int idAuthor, String firstName, String lastName) {
        this.idAuthor = idAuthor;
        this.firstName = firstName;
        this.lastName = lastName;
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
}
