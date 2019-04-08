package NavalBattle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MouseHandler implements MouseMotionListener {

    private int x, y;

    public MouseHandler(JLabel img) throws IOException {
        img.addMouseMotionListener(this);
    }

    public MouseHandler() throws IOException {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
          mouseEvent.getComponent().setLocation((mouseEvent.getX()+mouseEvent.getComponent().getX())-x, (mouseEvent.getY()+mouseEvent.getComponent().getY())-y);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        x = mouseEvent.getX();
        y = mouseEvent.getY();
    }

    private static BufferedImage resize(BufferedImage myPicture, int height, int width) {
        Image tmp = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp,0,0,null);
        g2d.dispose();
        return resized;
    }
}
