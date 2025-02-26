package com.teachmeskills.lesson_38.service;

import com.teachmeskills.lesson_38.annatation.Timed;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Timed
    public void firstMethod(){
        try {
            Thread.sleep(getRandomValue());
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    @Timed
    public void secondMethod(){
        try {
            Thread.sleep(getRandomValue());
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    @Timed
    public void thirdMethod(){
        try {
            Thread.sleep(getRandomValue());
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    private int getRandomValue(){
        return (int)(Math.random() * 2000);
    }

}
