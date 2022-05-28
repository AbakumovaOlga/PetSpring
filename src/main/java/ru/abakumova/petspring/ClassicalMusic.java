package ru.abakumova.petspring;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {
    public ClassicalMusic() {
        listSong.add("ClassicalMusicSong0");
        listSong.add("ClassicalMusicSong1");
        listSong.add("ClassicalMusicSong2");
    }

    public String getSong(int index) {

        return listSong.get(index);
    }
}
