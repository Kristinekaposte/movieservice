package com.example.movieservice.business.mappers;

import com.example.movieservice.business.repository.model.MovieDAO;
import com.example.movieservice.model.Movie;
import org.springframework.stereotype.Component;

/**
 * Maps between DAO (database layer) and domain model (business layer)
 */

@Component
public class MovieMapper {

    public Movie toModel(MovieDAO dao) {
        return Movie.builder()
                .id(dao.getId())
                .title(dao.getTitle())
                .genre(dao.getGenre())
                .releaseYear(dao.getReleaseYear())
                .rating(dao.getRating())
                .description(dao.getDescription())
                .build();
    }

    public MovieDAO toDAO(Movie movie) {
        return MovieDAO.builder()
                .id(movie.getId())
                .title(movie.getTitle())
                .genre(movie.getGenre())
                .releaseYear(movie.getReleaseYear())
                .rating(movie.getRating())
                .description(movie.getDescription())
                .build();
    }
}

