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
    String heroPic;
    Map map;
    Hero hero;
    Skeleton skeletonOne;
    Skeleton skeletonTwo;
    Skeleton skeletonThree;
    String skeletonPic;
    String bossPic;
    Boss boss;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        posX = 0;
        posY = 0;
        boardSide = 720;
        imgSide = 72;
        heroPic = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-down.png";
        skeletonPic = "C:/greenfox/pkrisz0/week-05/day-02/Images/skeleton.png";
        bossPic = "C:/greenfox/pkrisz0/week-05/day-02/Images/boss.png";

        map = new Map();

        hero = new Hero(heroPic, posX,posY);

        skeletonOne = new Skeleton(skeletonPic, 5,5);
        skeletonTwo = new Skeleton(skeletonPic, 4,9);
        skeletonThree = new Skeleton(skeletonPic, 7,3);

        boss = new Boss(bossPic,9,9);

        // set the size of your draw board
        setPreferredSize(new Dimension(boardSide, boardSide));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        //super.paint(graphics);
        // graphics.fillRect(testBoxX, testBoxY, imgSide, imgSide);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

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
            return (map.walls[hero.posY][hero.posX - 1] != 1);
        } else if (input.equals("x+1")) {
            return (map.walls[hero.posY][hero.posX + 1] != 1);
        } else if (input.equals("y-1")) {
            return (map.walls[hero.posY - 1][hero.posX] != 1);
        }else if (input.equals("y+1")) {
            return (map.walls[hero.posY + 1][hero.posX] != 1);
        }
        return false;
    }
}