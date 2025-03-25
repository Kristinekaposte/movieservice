package com.example.movieservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
    private String description;

}

