package tictaktoe;

public class Grid{
    Square [][] grid;
    
    class Square{
        String val; 

        public void set_nought(){
            val = "O";
        }

        public void set_cross(){
            val = "X";
        }

        public String get_val(){
            return val;
        }
    }


}