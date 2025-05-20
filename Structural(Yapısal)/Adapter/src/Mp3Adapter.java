public class Mp3Adapter implements MusicPlayer{

    private Mp3Player mp3Player;

    public Mp3Adapter(Mp3Player mp3player){
        this.mp3Player = mp3player;
    }

    @Override
    public void playMusic(){
        mp3Player.playMp3();  // eski methodu çağırır.
    }
}
