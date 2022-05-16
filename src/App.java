import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.event.PrintEvent;

import tictaktoe.*;

public class App {
    //Using this class for testing 
    public static void main(String[] args) throws Exception {
        /*
        Grid game = new Grid("hard");
        System.out.println(game.displayBoard());

        //Test have been carried out to check if all combinations work.
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,1})));
        System.out.print(game.botsTurn());
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,2})));
        System.out.print(game.botsTurn());

               
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,0})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,2})));

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
        
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{0,2})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{1,1})));
        System.out.print(game.usersTurn(Arrays.asList(new Integer[]{2,0})));

        
        */
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("hard/medium/easy (case sensitive)");

        String mode = myObj.nextLine(); 
        
        Grid game = new Grid(mode);

        System.out.println("Who goes first? Type user or bot.");

        String first = myObj.nextLine(); 

        if (first == "bot"){
            System.out.println(game.botsTurn());
        }

        while (game.checkWin() == false){
            List<Integer> USER = new ArrayList<Integer>();
            System.out.println("Enter the coordinate seperated by spaces: ");
            while (myObj.hasNextInt()){
                int i = myObj.nextInt();
                USER.add(i);
            }

            System.out.println(game.usersTurn(USER));
            USER.clear();

            System.out.println(game.botsTurn());
        }

        System.out.println("GAME OVER");

    }
}
