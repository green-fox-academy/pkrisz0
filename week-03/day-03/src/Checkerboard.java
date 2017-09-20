import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void mainDraw(Graphics graphics){
      // fill the canvas with a checkerboard pattern.
        int size = 20;
        int x = 0;
        int y = 0;


        for (int j = 0; j < HEIGHT / 20 + 1; j++) {
            for (int i = 0; i < WIDTH / 20 + 1; i++) {
                graphics.setColor(Color.WHITE);
                graphics.fillRect(x, y, size, size);
                graphics.setColor(Color.BLACK);
                graphics.fillRect(x + size, y, size, size);
                x += (size * 2);
            }
            y += 40;
            x = 0;
        }

        int xtwo = 0;
        int ytwo = 20;

        for (int j = 0; j < HEIGHT / 20 + 1; j++) {
            for (int i = 0; i < WIDTH / 20 + 1; i++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(xtwo, ytwo, size, size);
                graphics.setColor(Color.WHITE);
                graphics.fillRect(xtwo + size, ytwo, size, size);
                xtwo += (size * 2);
            }
            ytwo += 40;
            xtwo = 0;
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
