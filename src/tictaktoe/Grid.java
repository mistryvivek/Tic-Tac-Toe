package tictaktoe;

public class Grid{
    Square [][] grid;
    
    class Square{
        //Says whether is a nought or a cross.
        String val; 

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

    public void displayBoard(){
        String empty_line = "--------";
        String top_line = 

    }

    //Read a row and get it in the correct format.
    private String format(i){
        return grid[i][0].get_val() + "|" + grid[i][1].get_val() + "|" + grid[i][2].get_val();
    }

    

}