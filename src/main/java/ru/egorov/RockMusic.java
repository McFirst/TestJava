package ru.egorov;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private String[] musicList = new String[] {"Rock1", "Rock2", "Rock3"};
    @Override
    public String getSong(int index) {
        return musicList[index];
    }
}
