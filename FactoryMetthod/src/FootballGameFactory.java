public class FootballGameFactory extends GameFactory {

    @Override
    public Game createGame() {
        return new FootballGame();
    }
}
