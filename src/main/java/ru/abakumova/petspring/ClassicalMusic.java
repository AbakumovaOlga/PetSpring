package ru.abakumova.petspring;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "ClassicalMusicSong1";
    }

    private void doMyInit() {
        System.out.println("Do my init");
    }

    private void doMyDestroy() {
        System.out.println("Do my destroy");
    }
}
