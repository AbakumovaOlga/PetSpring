package ru.abakumova.petspring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {


    private List<Music> musicList=new ArrayList<>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for (Music music:musicList
             ) {
            System.out.println("Playing: "+music.getSong());
        }
    }
    private void doMyInit() {
        System.out.println("Do my init Player");
    }

    private void doMyDestroy() {
        System.out.println("Do my destroy Player");
    }

}
