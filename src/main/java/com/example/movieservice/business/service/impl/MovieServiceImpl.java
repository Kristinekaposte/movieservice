package com.example.movieservice.business.service.impl;

import com.example.movieservice.business.repository.MovieRepository;
import com.example.movieservice.business.repository.model.MovieDAO;
import com.example.movieservice.business.mappers.MovieMapper;
import com.example.movieservice.business.service.MovieService;
import com.example.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implements the movie-related business logic.
 */

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;
    private final MovieMapper mapper;

    public MovieServiceImpl(MovieRepository repository, MovieMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Movie createMovie(Movie movie) {
        MovieDAO saved = repository.save(mapper.toDAO(movie));
        return mapper.toModel(saved);
    }

    @Override
    public List<Movie> getAllMovies() {
        return repository.findAll()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public Movie getMovieById(Long id) {
        return repository.findById(id)
                .map(mapper::toModel)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    @Override
    public Movie updateMovie(Long id, Movie movie) {
        MovieDAO dao = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        dao.setTitle(movie.getTitle());
        dao.setGenre(movie.getGenre());
        dao.setReleaseYear(movie.getReleaseYear());
        dao.setRating(movie.getRating());
        dao.setDescription(movie.getDescription());

        return mapper.toModel(repository.save(dao));
    }

    @Override
    public void deleteMovie(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Movie not found");
        }
        repository.deleteById(id);
    }
}
