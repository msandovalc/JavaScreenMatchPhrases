package com.demo.project.screenmatch_phrases.controller;

import com.demo.project.screenmatch_phrases.dto.PhraseDTO;
import com.demo.project.screenmatch_phrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PhraseController {

    @Autowired
    private PhraseService service;

    @GetMapping("/series/frases")
    public PhraseDTO getPhrases(){
        return service.getRandomPhrase();
    }
}