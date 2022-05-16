package tictaktoe;

import java.util.List;

//Interface for tictactoe.
public interface GridI {
    public String displayBoard();
    public String botsTurn();
    public String usersTurn(List<Integer> gridPos);
    public Boolean checkWin();
}
