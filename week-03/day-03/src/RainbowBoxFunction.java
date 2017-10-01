import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
        System.out.println("How big, and what color: 1 - Green, 2 - Red, 3 - Blue");
        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);

        rainBow(graphics,userInput1.nextInt(),userInput2.nextInt());
    }

    public static void rainBow (Graphics c, int side, int color){
        if (color == 1){
            c.setColor(Color.GREEN);
        } else if (color == 2) {
            c.setColor(Color.RED);
        } else {
            c.setColor(Color.BLUE);
        }

        c.fillRect((WIDTH / 2 - side / 2), (HEIGHT / 2 - side / 2), side, side);

        // create a loop that fills the canvas with rainbow colored squares.

        // String[] rainbow = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET"};


    }

// create a square drawing function that takes 2 parameters:
// the square size, and the fill color,
// and draws a square of that size and color to the center of the canvas.
// create a loop that fills the canvas with rainbow colored squares.

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
