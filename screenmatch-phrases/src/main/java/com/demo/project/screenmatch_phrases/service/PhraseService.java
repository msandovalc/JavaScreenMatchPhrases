package com.demo.project.screenmatch_phrases.service;

import com.demo.project.screenmatch_phrases.dto.PhraseDTO;
import com.demo.project.screenmatch_phrases.model.Phrase;
import com.demo.project.screenmatch_phrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

    @Autowired
    private PhraseRepository repository;
    public PhraseDTO getRandomPhrase() {
        Phrase phrase = repository.getRandomPhrase();
        System.out.println(phrase.getTitle() + phrase.getPhrase() + phrase.getCharacter() + phrase.getPoster());
        return new PhraseDTO(phrase.getTitle(), phrase.getPhrase(), phrase.getCharacter(), phrase.getPoster());
    }
}