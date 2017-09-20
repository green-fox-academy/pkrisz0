import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){

        //top left
        int y = HEIGHT / 2 - 20;
        int x = 0;
        for (int i = 0; i < WIDTH / 40; i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(0,y,x,0);
            y -= 20;
            x += 20;
        }

        //top right
        int x1tr = WIDTH / 2;
        int y2tr = 20;
        for (int i = 0; i < WIDTH / 40; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(x1tr,0,WIDTH,y2tr);
            x1tr += 20;
            y2tr += 20;
        }

        //bottom right
        int x2bl = WIDTH - 20;
        int y1bl = HEIGHT / 2;
        for (int i = 0; i < WIDTH / 40; i++) {
            graphics.setColor(Color.RED);
            graphics.drawLine(WIDTH,y1bl,x2bl,HEIGHT);
            x2bl -= 20;
            y1bl += 20;
        }

        //bottom left
        int y1br = HEIGHT / 2;
        int x2br = 0;
        for (int i = 0; i < WIDTH / 40; i++) {
            graphics.setColor(Color.YELLOW);
            graphics.drawLine(0, y1br, x2br, HEIGHT);
            y1br += 20;
            x2br += 20;
            
//THIS COULD ALL BE ONE GIANT FORI
        }
    }

// divide the canvas into 4 parts
// and repeat this pattern in each quarter:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

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
