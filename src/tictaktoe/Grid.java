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
        return grid[0][i].get_val() + "|" + grid[1][i].get_val() + "|" + grid[2][i].get_val();
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

    public Boolean checkWin(){
        //This runs a method that increments x and y using steps that should win.
        //Stops once the pattern stops working.
        return (checkWin((Arrays.asList(new Integer[]{0,0})), grid[0][0].get_val(), 0, 1) || 
                checkWin((Arrays.asList(new Integer[]{0,0})), grid[0][0].get_val(), 1, 0 ) ||
                checkWin((Arrays.asList(new Integer[]{0,0})), grid[0][0].get_val(), 1, 1 ) ||
                checkWin((Arrays.asList(new Integer[]{2,2})), grid[2][2].get_val(), 0, -1 ) ||
                checkWin((Arrays.asList(new Integer[]{2,2})), grid[2][2].get_val(), -1, 0) ||
                checkWin((Arrays.asList(new Integer[]{2,0})), grid[0][2].get_val(), -1, 1)) ;       
    }

    //Convience method.
    private Boolean checkWin(List<Integer> current, String value, int xIncrement, int yIncrement){ 
        //If it is out of bounds, it is true.
        if (current.get(0) > 2 || current.get(0) < 0 || current.get(1) > 2 || current.get(1) < 0 ){
            return true;
        }
        //Reached an undefined square so it must stop.
        else if (value == "U"){
            return false;
        }
        //If it is the same value as the previous grid.
        //Increment the list have to create copy so it does not effect the memory location.
        else if (grid[current.get(0)][current.get(1)].get_val() == value){
            List<Integer> copyList = new ArrayList<>();
            copyList.add(current.get(0) + xIncrement);
            copyList.add(current.get(1) + yIncrement);
            return checkWin(copyList, value, xIncrement, yIncrement);
        }
        //If the value isn't the same as the last there must not be a winning move.
        else{
            return false;
        }
    }
    

    

}