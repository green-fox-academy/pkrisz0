import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        threeSquares(graphics, 50,50);
    }

    public static void threeSquares (Graphics s, int x, int y){
        int side = 50;
        s.drawRect(x,y,side,side);
        s.fillRect(x + 70,y + 70,side,side);
        s.drawRect(x + 140,y + 140,side,side);
    }


// create a square drawing function that takes 2 parameters:
// the x and y coordinates of the square's top left corner
// and draws a 50x50 square from that point.
// draw 3 squares with that function.


//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
