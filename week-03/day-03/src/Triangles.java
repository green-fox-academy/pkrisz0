import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {


        int side = 30;   //a
        double z = (cubeRoot(3) * side) / 2; //height of triangle

        int x2 = 100 - side / 2;
        int x3 = 100 + side / 2;
        int y23 = 25 + (int)z;

        //line 1
        int xpoints[] = {100, x2, x3};
        int ypoints[] = {25, y23, y23};
        int npoints = 3;

        graphics.drawPolygon(xpoints, ypoints, npoints);

        // line 2
        //triangle #1
        int xpoints2[] = {x2, x2 - side / 2, x2 + side / 2};
        int ypoints2[] = {25 + (int)z, y23 + (int)z, y23 + (int)z};
        int npoints2 = 3;

        graphics.drawPolygon(xpoints2, ypoints2, npoints2);

        //triangle #2
        int xpoints3[] = {x3,x2 + side / 2, x3 + side / 2};
        int ypoints3[] = {25 + (int) z, y23 + (int)z, y23 + (int)z};
        int npoints3 = 3;

        graphics.drawPolygon(xpoints3, ypoints3, npoints3);


        /*
        now put this into a function
        no of triangles increases +1 /iteration
        y coordinates increase by z each iteration
        x2y2 and x3y3 become x1y1 in the new line
        left x3y3 will be the same as right x2y2
        size to the left iterates w -side/2 to the right with +side/2
        */
    }

    public static double cubeRoot(int a) {
        return Math.pow(a, 1.0 / 3);
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


// create a 300x300 canvas.