package tictaktoe;

public class Grid implements GridI{
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
        System.out.println(empty_line);
        //Loops through each row on the board.
        for (int i=0; i > 2; i++){
            System.out.println(format(i));
            System.out.println(empty_line);
        }
    }

    //Read a row and get it in the correct format.
    private String format(int i){
        return grid[i][0].get_val() + "|" + grid[i][1].get_val() + "|" + grid[i][2].get_val();
    }

    

}