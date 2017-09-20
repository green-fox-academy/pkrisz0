import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){

        center(graphics,25,25);

    }

    public static void center (Graphics c, int x, int y){
        c.setColor(Color.RED);
        c.drawLine(x,y,WIDTH / 2,HEIGHT / 2 );

        //fill the thing

        int ex = 0;
        for (int i = 0; i < WIDTH / 20 + 1; i++) {
             c.setColor(Color.GREEN);
             c.drawLine(ex, 0, WIDTH / 2, HEIGHT / 2); //top
             c.drawLine(0, ex, WIDTH / 2, HEIGHT / 2); //right
             c.drawLine(WIDTH, ex, WIDTH / 2, HEIGHT / 2); //left
             c.drawLine(ex, HEIGHT, WIDTH / 2, HEIGHT / 2);//bottom

             ex += 20;
        }
    }

    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.


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
