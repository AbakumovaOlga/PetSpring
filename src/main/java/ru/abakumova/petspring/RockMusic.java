package ru.abakumova.petspring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "RockMusicSong1";
    }
}
