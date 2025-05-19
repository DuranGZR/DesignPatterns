
public class Main {
    public static void main(String[] args) {

        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade theater = new HomeTheaterFacade(dvd, projector, sound);

        theater.watchMovie();    // Tek yerden tüm sistemler açılır
        theater.endMovie();      // Tek yerden kapatılır

    }
}