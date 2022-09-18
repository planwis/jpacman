package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;

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
    void testBoardWithNullSquare(){
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
    }

    @Test
    void testSquareAtWithNormalInitiation() {
        Square aSquare = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = aSquare;
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isEqualTo(aSquare);
    }

    @Test
    void testSquareAtWithNullSquareInitiation() {
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isEqualTo(grid[0][0]);
    }
}
