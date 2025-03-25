package com.example.movieservice.business.service;

import com.example.movieservice.model.Movie;
import java.util.List;

public interface MovieService {

    Movie createMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie getMovieById(Long id);

    Movie updateMovie(Long id, Movie movie);

    void deleteMovie(Long id);
}

