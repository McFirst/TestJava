package ru.egorov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.List;

//@Component
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
    private List<Music> musicList;

    //@Autowired
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public  String playMusic(){
        int count = musicList.size();
        SecureRandom secureRandom = new SecureRandom();
        int index = secureRandom.nextInt(count);
        return "Playing " + musicList.get(index).getSong();
    }
}

