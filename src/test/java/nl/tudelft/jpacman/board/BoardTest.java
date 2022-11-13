package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Wish
 */
public class BoardTest {
    /**
     * Do we get the correct board?
     */
    @Test
    void testBoard() {
        Square aSquare = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = aSquare;
        Board board = new Board(grid);
    }
    /**
     * How constructor works when there is Null square
     */
    @Test
    void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
    }
    /**
     * Normal Initiation
     */
    @Test
    void testSquareAtWithNormalInitiation() {
        Square aSquare = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = aSquare;
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(aSquare);
    }
    /**
     * testSquareAtWithNullSquareInitiation
     */
    @Test
    void testSquareAtWithNullSquareInitiation() {
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }
}
