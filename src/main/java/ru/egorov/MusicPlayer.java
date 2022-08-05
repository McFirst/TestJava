package ru.egorov;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private Music music;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;

    public String getName() {
        return name;
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

    private int volume;

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }

    public  void playMusic(){
        System.out.println("Playing " + music.getSong());
        //for(Music music : musicList){System.out.println("Playing " + music.getSong());}
    }
}
