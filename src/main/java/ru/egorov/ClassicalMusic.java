package ru.egorov;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private String[] musicList = new String[] {"Classic1", "Classic2", "Classic3"};
    @Override
    public String getSong(int index) {
        return musicList[index];
    }
}
