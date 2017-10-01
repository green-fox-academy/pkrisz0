import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {
    public static void mainDraw(Graphics graphics) {

        graphics.drawOval(0 ,0,HEIGHT, HEIGHT); //base
        int xLeft = WIDTH;
        int yDown = 0;
        int r1 = WIDTH / 2;
        int n = 10;

        drawCircle(graphics, xLeft, yDown, r1, r1, n);
    }

    public static void drawCircle (Graphics g, int xLeft, int yDown, int r1, int r2, int n){
        g.drawOval(xLeft / 4, yDown, r1, r1); //top
        g.drawOval(yDown + 15,xLeft / 3 + 5, r1, r1); //left
        g.drawOval(xLeft / 2 - 15,xLeft / 3 + 5, r1, r1); //right


        if (n == 0) {
            return;
        } else {
            drawCircle(g,xLeft / 4 / 4, yDown, r1 / 2 / 2,r1 / 2, n - 1);
            drawCircle(g,yDown + 15 / 2,xLeft / 3 / 3+ 5, r1 / 2, r1 / 2, n - 1);
            drawCircle(g,xLeft / 2 - 15 / 2 ,xLeft / 3 / 3 + 5, r1 / 2, r1 / 2, n - 1);
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
