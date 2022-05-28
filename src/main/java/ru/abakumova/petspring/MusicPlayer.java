package ru.abakumova.petspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

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
