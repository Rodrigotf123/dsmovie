package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.backend.entities.Score;
import com.devsuperior.backend.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
