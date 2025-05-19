public class Main {
    public static void main(String[] args) {
        GameFactory factory = new ChessGameFactory(); // veya new FootballGameFactory();
        Game game = factory.createGame();
        game.play();
    }
}
