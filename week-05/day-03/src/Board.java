import javax.swing.*;
import java.awt.*;

public class Board extends JComponent {

    int testBoxX;
    int testBoxY;
    int posX;
    int posY;
    int boardSide;


    public Board() {
        boardSide = 720;
        // set the size of your draw board
        setPreferredSize(new Dimension(boardSide, boardSide));
        setVisible(true);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

        Map map = new Map();
        map.paint(graphics);
    }
}
