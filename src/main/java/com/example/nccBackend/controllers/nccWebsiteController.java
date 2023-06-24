package com.example.nccBackend.controllers;

import com.example.nccBackend.services.googleCalendarService;
import com.example.nccBackend.services.verseOfTheDayService;
import com.example.nccBackend.models.calendarEvent;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@CrossOrigin
public class nccWebsiteController {

    @Autowired
    verseOfTheDayService VerseOftheDayService;

    @Autowired
    googleCalendarService GoogleCalendarService;


    @GetMapping("/verse")
    public StringBuffer getVerse() throws InterruptedException, ExecutionException, IOException {
        return VerseOftheDayService.getVerseOfTheDay();
    }

    @GetMapping("/calendarEvents")
    public StringBuffer getCalendar() throws InterruptedException, ExecutionException, IOException{
        return GoogleCalendarService.getCalendarEvents();
    }
}
