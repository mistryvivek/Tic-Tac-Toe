import tictaktoe.*;

public class App {
    //Using this class for testing 
    public static void main(String[] args) throws Exception {
        Grid game = new Grid();
        System.out.println(game.displayBoard());

        for (int i = 0; i < 9; i++){
            System.out.println(game.botsTurn());
        }
        

    }
}
