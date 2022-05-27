package ru.abakumova.petspring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "ClassicalMusicSong1";
    }
}
