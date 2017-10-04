import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Hero extends PositionedImage {

    String left = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-left.png";
    String down = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-down.png";
    String right = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-right.png";
    String up = "C:/greenfox/pkrisz0/week-05/day-02/Images/hero-up.png";


    public Hero(String filename, int posX, int posY) {
        super("C:/greenfox/pkrisz0/week-05/day-02/Images/hero-down.png", posX, posY);
    }

    public void turn(String direction){
        try {
            if (direction.equals("left")){
            image = ImageIO.read(new File(left));
            } else if (direction.equals("right")){
                image = ImageIO.read(new File(right));
            } else if (direction.equals("down")){
                image = ImageIO.read(new File(down));
            } else if (direction.equals("up")){
                image = ImageIO.read(new File(up));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
