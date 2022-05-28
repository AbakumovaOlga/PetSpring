package ru.abakumova.petspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    public ClassicalMusic() {
        listSong.add("ClassicalMusicSong0");
        listSong.add("ClassicalMusicSong1");
        listSong.add("ClassicalMusicSong2");
    }

    public void doMyInit(){
        System.out.println("doMyInit");
    }
    public String getSong(int index) {

        return listSong.get(index);
    }
}
