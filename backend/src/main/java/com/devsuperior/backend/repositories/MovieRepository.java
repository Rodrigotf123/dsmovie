package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.backend.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
