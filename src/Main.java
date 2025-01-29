//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.import songboard.*;
//import songboard.*;
import songboard.*;

// Test SongBoard Implementation
public class Main {
    public static void main(String[] args) {
        //SongBoard mySongBoard;
        SongBoard mySongBoard = new SongBoard();
        mySongBoard.printTopTen();
        mySongBoard.scrambleBoard();
        // See if the scramble board worked
        System.out.println("\n\nThe new scrambled board is:");
        mySongBoard.printTopTen();
        // Now make call to insertionSortBoard here
        mySongBoard.insertionSortBoard();
        System.out.println("\n\nThe board is now:");
        mySongBoard.printTopTen();
    }
}