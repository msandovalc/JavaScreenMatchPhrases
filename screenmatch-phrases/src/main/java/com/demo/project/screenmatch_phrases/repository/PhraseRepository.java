package com.demo.project.screenmatch_phrases.repository;

import com.demo.project.screenmatch_phrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
    //@Query("SELECT f FROM phrases f order by function('RANDOM') LIMIT 1")
    @Query(value = "SELECT f FROM Phrase f ORDER BY RANDOM() LIMIT 1")
    public Phrase getRandomPhrase();
}