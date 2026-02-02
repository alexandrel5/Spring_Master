package com.example.implementation;

import com.example.beans.Song;
import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song) {
        return "Playing the song "+ song.getTitle()+" by " + song.getSingerName() + "with Bose speakers";
    }
}
