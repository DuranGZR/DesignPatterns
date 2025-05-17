public class HomeTheaterFacade {

    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd , Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(){
        System.out.println("Movie Started");
        dvd.on();
        projector.on();
        sound.on();
        dvd.play();
    }

    public void endMovie(){
        System.out.println("Movie Ended");
        dvd.off();
        projector.off();
        sound.off();

    }
}
