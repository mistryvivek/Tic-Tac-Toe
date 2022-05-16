import java.util.Arrays;
import java.util.List;

import tictaktoe.*;

public class App {
    //Using this class for testing 
    public static void main(String[] args) throws Exception {
        Grid game = new Grid();
        System.out.println(game.displayBoard());

        //Test have been carried out to check if all combinations work.
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,2})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,0})));
               

        /*
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,2})));

        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,0})));
      
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,2})));
        
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,2})));
        
        
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,2})));
        
        

        
        */

        System.out.println(game.checkWin());
        

    }
}
