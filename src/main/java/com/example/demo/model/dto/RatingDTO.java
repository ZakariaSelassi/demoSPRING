package com.example.demo.model.dto;

import com.example.demo.model.entity.Animes;
import com.example.demo.model.entity.Users;

import javax.persistence.*;

public class RatingDTO{

        private int idRating;
        private int ratingNumber;

        public RatingDTO(){}

        public RatingDTO(int idRating, int ratingNumber) {
                this.idRating = idRating;
                this.ratingNumber = ratingNumber;
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
}
