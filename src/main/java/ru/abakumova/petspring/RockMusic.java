package ru.abakumova.petspring;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    public RockMusic() {
        listSong.add("RockMusicSong0");
        listSong.add("RockMusicSong1");
        listSong.add("RockMusicSong2");
    }

    @Override
    public String getSong(int index) {
        return listSong.get(index);
    }
}
