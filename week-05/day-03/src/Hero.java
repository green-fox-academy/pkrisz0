import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Hero extends PositionedImage implements KeyListener {


    public Hero() {
    }


    public Hero(BufferedImage image, int posX, int posY) {
        super(image, posX, posY);
    }

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 1;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 1;
        }
        // and redraw to have a new picture with the new coordinates
        //repaint();
    }
}



