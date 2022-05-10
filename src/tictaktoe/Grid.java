package tictaktoe;

import java.util.Random;

public class Grid implements GridI{
    Square [][] grid = new Square[3][3];
    
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
    private Square easyBotChoice(){
        Random posOne = new Random();
        Random posTwo = new Random();
        return grid[posOne.nextInt(2)][posTwo.nextInt(2)];
    }

    

    

}