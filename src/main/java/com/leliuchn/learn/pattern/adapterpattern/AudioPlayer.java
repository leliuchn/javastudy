package com.leliuchn.learn.pattern.adapterpattern;

/**
 * Created by leliuchn on 16/11/18.
 */

///实现统一的接口，使用适配器对象，就可以播放其它格式文件，具体不需要知道适配器是怎么工作的，使用就行。
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
