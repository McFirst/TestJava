package ru.egorov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private  int volume;
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //@Autowired
    //@Qualifier("classicalMusic")
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public  String playMusic(Genre genre){
        SecureRandom secureRandom = new SecureRandom();
        int index = secureRandom.nextInt(3);
        if (genre == Genre.CLASSICAL) {
            return "Playing " + music2.getSong(index);
        }
        else {
            return "Playing " + music1.getSong(index);
        }
    }
}

