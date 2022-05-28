package ru.abakumova.petspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music {
    public ClassicalMusic() {
        listSong.add("ClassicalMusicSong0");
        listSong.add("ClassicalMusicSong1");
        listSong.add("ClassicalMusicSong2");
    }

    @Override
    public String getSong() {
        Random random=new Random();
        return listSong.get(random.nextInt(listSong.size()));
    }
}
