package com.example.nccBackend.services;

import com.example.nccBackend.models.calendarEvent;
import com.example.nccBackend.models.verseOftheDay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class googleCalendarService {

    public calendarEvent getVerseOfTheDay() throws IOException {
        URL url = new URL("https://www.googleapis.com/calendar/v3/calendars/euivajuod3cpk9vcigr9juvo8s@group.calendar.google.com/events?key=");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");


    }
}
