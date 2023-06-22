package com.example.nccBackend.services;

import com.example.nccBackend.models.verseOftheDay;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;


@Service
public class verseOfTheDayService {


    public StringBuffer getVerseOfTheDay() throws IOException {
        URL url = new URL("https://beta.ourmanna.com/api/v1/get");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        verseOftheDay verseOftheDay = null;

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        return content;
    }

}
