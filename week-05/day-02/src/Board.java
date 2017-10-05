import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
    int posX;
    int posY;
    int boardSide;
    Map map;
    Hero hero;
    Skeleton skeletonOne;
    Skeleton skeletonTwo;
    Skeleton skeletonThree;
    Boss boss;

    public Board() {
        posX = 0;
        posY = 0;
        boardSide = 720;

        map = new Map();
        hero = new Hero(posX,posY);

        skeletonOne = new Skeleton(4,3);
        skeletonTwo = new Skeleton( 4,6);
        skeletonThree = new Skeleton(7,7);

        boss = new Boss(9,9); // *here comes the new boss, same as the old boss*

        // set the size of your draw board
        setPreferredSize(new Dimension(boardSide, boardSide));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {

        //draw board with walls
        for (int j = 0; j < map.walls.length; j++) {
            for (int i = 0; i <  map.walls.length; i++) {
                if ( map.walls[j][i] == 1) {
                    PositionedImage wall = new PositionedImage("C:/greenfox/pkrisz0/week-05/day-02/Images/wall.png",i,j);
                    wall.draw(graphics);
                } else if ( map.walls[j][i] == 0) {
                    PositionedImage background = new PositionedImage("C:/greenfox/pkrisz0/week-05/day-02/Images/floor.png", i, j);
                    background.draw(graphics);
                }
            }
        }

        hero.draw(graphics);
        skeletonOne.draw(graphics);
        skeletonTwo.draw(graphics);
        skeletonThree.draw(graphics);
        boss.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
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
        if (e.getKeyCode() == KeyEvent.VK_UP && stayIn("y-1")) {
            hero.posY--;
            hero.turn("up");
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN && stayIn("y+1")) {
            hero.posY++;
            hero.turn("down");
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT && stayIn("x-1")) {
            hero.posX--;
            hero.turn("left");
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT && stayIn("x+1")) {
            hero.posX++;
            hero.turn("right");
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }

    public boolean stayIn(String input){
        if (input.equals("x-1")){
            return (!map.isItAWall(hero.posY,hero.posX - 1));
        } else if (input.equals("x+1")) {
            return (!map.isItAWall(hero.posY,hero.posX + 1));
        } else if (input.equals("y-1")) {
            return (!map.isItAWall(hero.posY - 1,hero.posX));
        } else if (input.equals("y+1")) {
            return (!map.isItAWall(hero.posY + 1,hero.posX));
        }
        return false;
    }
}

