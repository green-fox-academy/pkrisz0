import java.awt.*;

public class Map extends PositionedImage {
    int imgSide;

    public Map() {

    }

    int[][] walls = new int[][]{
            {0,0,0,1,0,1,0,0,0,0},  //0
            {0,0,0,1,0,1,0,1,1,0},  //1
            {0,1,1,1,0,1,0,1,1,0},  //2
            {0,0,0,0,0,1,0,0,0,0},  //3
            {1,1,1,1,0,1,1,1,1,0},  //4
            {0,1,0,1,0,0,0,0,1,0},  //5
            {0,1,0,1,0,1,1,0,1,0},  //6
            {0,1,0,0,0,0,0,0,1,0},  //7
            {0,0,0,1,0,1,1,0,1,0},  //8
            {0,1,0,1,0,1,0,0,0,0}   //9
    };

    public void paint(Graphics graphics) {

        for (int j = 0; j < walls.length; j++) {
            for (int i = 0; i < walls.length; i++) {
                if (walls[j][i] == 1) {
                    PositionedImage wall = new PositionedImage("C:/greenfox/pkrisz0/week-05/day-02/Images/wall.png", i, j);
                    wall.draw(graphics);
                } else if (walls[j][i] == 0) {
                    PositionedImage background = new PositionedImage("C:/greenfox/pkrisz0/week-05/day-02/Images/floor.png", i, j);
                    background.draw(graphics);
                }
            }
        }
    }
}
