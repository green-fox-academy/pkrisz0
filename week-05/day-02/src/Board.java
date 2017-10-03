import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    int posX;
    int posY;
    int boardSide;
    int imgSide;
    String display;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        posX = 0;
        posY = 0;
        boardSide = 720;
        imgSide = 72;
        display = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-down.png";

        // set the size of your draw board
        setPreferredSize(new Dimension(boardSide, boardSide));
        setVisible(true);
    }

    //map for wall
    int[][] walls = new int[][]{
            {0,0,0,1,0,1,0,0,0,0},  //0
            {0,0,0,1,0,1,0,1,1,0},  //1
            {0,1,1,1,0,1,0,1,1,0},  //2
            {0,0,0,0,0,1,0,0,0,0},  //3
            {1,1,1,1,0,1,1,1,1,0},  //4
            {0,1,0,1,0,0,0,0,1,0},  //5
            {0,1,0,1,0,1,1,0,1,0},  //6
            {0,1,0,0,0,0,0,0,1,0},  //7
            {0,0,0,1,0,1,1,0,1,0},  //8
            {0,1,0,1,0,1,0,0,0,0}   //9
    };

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // graphics.fillRect(testBoxX, testBoxY, imgSide, imgSide);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        //draw board with walls

        for (int j = 0; j < walls.length; j++) {
            for (int i = 0; i < walls.length; i++) {
                if (walls[j][i] == 1) {
                    PositionedImage wall = new PositionedImage("C:/greenfox/pkrisz0/week-05/day-02/Images/wall.png",imgSide * i,imgSide * j);
                    wall.draw(graphics);
                } else if (walls[j][i] == 0) {
                    PositionedImage background = new PositionedImage("C:/greenfox/pkrisz0/week-05/day-02/Images/floor.png", imgSide * i, imgSide * j);
                    background.draw(graphics);
                }
            }
        }

        //hero
        PositionedImage hero = new PositionedImage(display, testBoxX, testBoxY);
        hero.draw(graphics);

    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= imgSide;
            display = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-up.png";
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += imgSide;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            testBoxX -= imgSide;
            display = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-left.png";
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            testBoxX += imgSide;
            display = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-right.png";
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}