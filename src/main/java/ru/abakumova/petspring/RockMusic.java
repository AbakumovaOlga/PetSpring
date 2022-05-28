package ru.abakumova.petspring;

import org.springframework.stereotype.Component;

import java.util.Random;


public class RockMusic implements Music{

    public RockMusic() {
        listSong.add("RockMusicSong0");
        listSong.add("RockMusicSong1");
        listSong.add("RockMusicSong2");
    }

    @Override
    public String getSong() {
        Random random=new Random();
        return listSong.get(random.nextInt(listSong.size()));
    }
}
