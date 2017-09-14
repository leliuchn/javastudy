package com.leliuchn.learn.pattern.adapterpattern;

/**
 * Created by leliuchn on 16/11/18.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {

    }
}
