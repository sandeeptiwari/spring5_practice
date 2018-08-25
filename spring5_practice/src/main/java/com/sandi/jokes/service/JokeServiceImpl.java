package com.sandi.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

   /* public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
