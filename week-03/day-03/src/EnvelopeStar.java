import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){

        //top right numbers to be incremented
        int y1tr = 10;
        int x2tr = WIDTH / 2;
        //bottom right to be incremented
        int y1br = HEIGHT - 10;
        int x2br = WIDTH / 2;
        //bottom left to be incremented
        int x1bl =0;
        int y2bl = HEIGHT / 2 + 20;
        //top left to be incremented
        int x1tl = 0;
        int y2tl = HEIGHT / 2 - 20;

        for (int i = 0; i < WIDTH / 40; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH / 2, y1tr, x2tr, HEIGHT / 2); //top right
            graphics.drawLine(WIDTH / 2, y1br, x2br, HEIGHT / 2); //bottom right
            graphics.drawLine(x1bl,HEIGHT / 2, WIDTH / 2, y2bl); //bottom left
            graphics.drawLine(x1tl,HEIGHT / 2, WIDTH / 2, y2tl); //top left

            y1tr += 20;
            x2tr += 20;
            y1br -= 20;
            x2br += 20;
            x1bl += 20;
            y2bl += 20;
            x1tl += 20;
            y2tl -= 20;
       }
    }

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
