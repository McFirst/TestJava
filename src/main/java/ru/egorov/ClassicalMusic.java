package ru.egorov;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doInit(){
        System.out.println("Init");
    }

    @PreDestroy
    public void doDestr(){
        System.out.println("Destr");
    }
    //private String[] musicList = new String[] {"Classic1", "Classic2", "Classic3"};
    @Override
    public String getSong() {
        return "Classic";
    }


}
