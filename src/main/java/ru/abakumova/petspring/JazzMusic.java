package ru.abakumova.petspring;

import java.util.Random;

public class JazzMusic implements Music{

    public JazzMusic() {
        listSong.add("JazzMusicSong0");
        listSong.add("JazzMusicSong1");
        listSong.add("JazzMusicSong2");
    }

    @Override
    public String getSong() {
        Random random=new Random();
        return listSong.get(random.nextInt(listSong.size()));
    }
}
