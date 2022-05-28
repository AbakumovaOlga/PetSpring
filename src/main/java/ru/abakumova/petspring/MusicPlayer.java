package ru.abakumova.petspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(Genre genre) {
        Random random = new Random();
        String res = "Playing: ";
        switch (genre) {
            case ROCK: {
                res += rockMusic.getSong(random.nextInt(3));
                break;
            }
            case CLASSICAL: {
                res += classicalMusic.getSong(random.nextInt(3));
                break;
            }
        }
        return res;
    }
}
