package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

public class BoardTest {

    @Test
    void testBoard(){
        Square aSquare = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = aSquare;
        Board board = new Board(grid);
    }

    @Test
    void testSquareAt(){
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
    }
}
