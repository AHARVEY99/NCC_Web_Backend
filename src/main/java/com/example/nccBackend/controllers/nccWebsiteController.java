package com.example.nccBackend.controllers;

import com.example.nccBackend.services.verseOfTheDayService;
import com.example.nccBackend.models.verseOftheDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@RestController
public class nccWebsiteController {

    @Autowired
    verseOfTheDayService VerseOftheDayService;


    @GetMapping("/verse")
    public StringBuffer getVerse() throws InterruptedException, ExecutionException, IOException {
        return VerseOftheDayService.getVerseOfTheDay();
    }
}
