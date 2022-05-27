package ru.abakumova.petspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer1=context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2=context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer1.setVolume(10);

        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
