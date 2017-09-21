import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawRectangle {
    public static void mainDraw(Graphics graphics){
        drawRectangle(graphics,0,0,0, 200);
    }

    static void drawRectangle (Graphics g, int n, int x, int y, int size){
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,WIDTH,HEIGHT);

        g.setColor(Color.BLACK);
        g.drawRect(HEIGHT / 3, y, size, size); //right
        g.drawRect(x,y, size, size); //left
        g.drawRect(WIDTH / 3,HEIGHT / 3, size, size); //bottomright
        g.drawRect(0 ,HEIGHT / 3, size, size); //bottomleft
    }

    public static void smallrect(Graphics c, int n, int x, int y, int size){
        if (n == 0){
           return;
        } else {
            drawRectangle(c, 1, 0, 0, 15); //
            smallrect(c, 4, 0, 0, 30);
        }
    }


    //    Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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
