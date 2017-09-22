import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawRectangle {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, HEIGHT, HEIGHT); //background
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0,0,HEIGHT, HEIGHT); //frame itt

        int n = 5;
        int boxsize = 300;
        int xLeft = 0;  // = 300
        int yDown = 0;  // = 300


        drawRectangle(graphics, xLeft, yDown, boxsize, n);
    }

    static void drawRectangle(Graphics g, int xLeft, int yDown, int boxsize, int n) {
       //kezdoertekek nem lehetnek konstans 0
        g.setColor(Color.BLACK);        //starting four
        g.drawRect(xLeft + boxsize, yDown, boxsize, boxsize); // top middle
        g.drawRect(xLeft, yDown + boxsize, boxsize,boxsize); // middle left
        g.drawRect(xLeft + boxsize, (yDown + boxsize * 2), boxsize, boxsize); // bottom middle
        g.drawRect((xLeft + boxsize * 2), yDown + boxsize, boxsize, boxsize); // middle right


        if (n == 0) {
            return;
        } else {
            drawRectangle(g,xLeft + boxsize, yDown, boxsize / 3, n - 1);
            drawRectangle(g,xLeft, yDown + boxsize, boxsize / 3, n - 1);
            drawRectangle(g,xLeft + 2 * boxsize, yDown + boxsize, boxsize / 3, n - 1);
            drawRectangle(g,xLeft + boxsize, yDown + 2 * boxsize, boxsize / 3, n - 1);
            return;
        }
    }

        //    Don't touch the code below
        static int WIDTH = 900;
        static int HEIGHT = 900;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}


