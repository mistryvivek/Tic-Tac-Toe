package tictaktoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Grid implements GridI{
    Square [][] grid = new Square[3][3];
    //Easy to get random objects from lists.
    //Order may help with removing items.
    List<List<Integer>> avaliable = new ArrayList<>();
    
    class Square{
        //Says whether is a nought or a cross.
        String val; 

        public Square(){
            //Undefined squares from the beginning.
            val = "U";
        }

        //Setter methods.
        public void set_nought(){
            val = "O";
        }

        public void set_cross(){
            val = "X";
        }

        //Getter methods.
        public String get_val(){
            return val;
        }
    }

    //By default set all grids to undefined.
    public Grid(){
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                grid[i][j] = new Square();
                //Everything is avaliable from the start.
                avaliable.add(Arrays.asList(i,j));
            }
        }
    }

    public String displayBoard(){
        String empty_line = "-----";
        String output = empty_line;
        //Loops through each row on the board.
        for (int i=0; i < 3; i++){
            output = output + "\n" + format(i) + "\n" + empty_line;
        }
        return output;
    }

    //Read a row and get it in the correct format.
    private String format(int i){
        return grid[i][0].get_val() + "|" + grid[i][1].get_val() + "|" + grid[i][2].get_val();
    }

    //Easy bot places "x" at random places in the grid.
    private List<Integer> easyBotChoice(){
        Random rand = new Random();
        List<Integer> pos = avaliable.get(rand.nextInt(avaliable.size()));
        avaliable.remove(pos);
        return pos;
    }

    //Create a method that marks the position of the Grid.
    public String botsTurn(){
        List<Integer> coord = easyBotChoice();
        grid[coord.get(0)][coord.get(1)].set_cross();
        return displayBoard();
    }

    //User inputs 2D list and then it makes their move.
    public String usersTurn(List<Integer> gridPos){
        //Santity check.
        if (gridPos.size() != 2 ||
            gridPos.get(0) + gridPos.get(1) > 4 || 
            gridPos.get(0) + gridPos.get(1) < -1){
            throw new IllegalArgumentException();
        }
        grid[gridPos.get(0)][gridPos.get(1)].set_nought();
        return displayBoard();
    }

    

    

}