package solidPrinciples.liskov;

interface MusicPlayer {  //todo double check
    void playMusic(String fileName);
}

interface VideoPlayer {
    void playVideo(String videoFileName);
}

interface Communicator {
    void sendSMS();

    void call();
}

class Ipod implements MusicPlayer {

    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing " + fileName + " music in Ipod");
    }
}

class Mobile implements MusicPlayer, VideoPlayer, Communicator {

    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing " + fileName + " music in mobile");
    }

    @Override
    public void playVideo(String videoFileName) {
        System.out.println("Playing " + videoFileName + " in mobile");
    }

    @Override
    public void sendSMS() {
        System.out.println("Sending sms");
    }

    @Override
    public void call() {
        System.out.println("Making call");
    }
}

public class MobileApp {
    public static void main(String[] args) {
        MusicPlayer ipod = new Ipod();
        ipod.playMusic("song.mp3");


        Mobile smartphone = new Mobile();
        smartphone.playMusic("song.mp3");
        smartphone.playVideo("movie.mp4");
        smartphone.sendSMS();
        smartphone.call();
    }
}
