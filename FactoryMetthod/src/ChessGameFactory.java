public class ChessGameFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new ChessGame();
    }
}

