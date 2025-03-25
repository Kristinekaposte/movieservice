package com.example.movieservice.business.repository;

import com.example.movieservice.business.repository.model.MovieDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieDAO, Long> {

//    // Find all movies by genre
//    List<MovieDAO> findByGenre(String genre);
//
//    // Find movies containing a keyword in the title (case-insensitive)
//    List<MovieDAO> findByTitleContainingIgnoreCase(String keyword);
//
//    // Get top-rated movies above a certain rating
//    List<MovieDAO> findByRatingGreaterThanEqual(double minRating);
//
//    // Custom filter method with multiple params
//    List<MovieDAO> findByGenreAndReleaseYear(String genre, int releaseYear);
}
