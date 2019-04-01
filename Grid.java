package NavalBattle;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grid extends JPanel {


    public Grid() throws IOException {
    }

    private static BufferedImage resize(BufferedImage myPicture, int height, int width) {
    Image tmp = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2d = resized.createGraphics();
    g2d.drawImage(tmp,0,0,null);
    g2d.dispose();
    return resized;
    }

    BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
    BufferedImage resized = resize(myPicture, 50, 50);

 public void paintComponent(Graphics g){
     super.paintComponent(g);
     g.drawImage(resized, 100,100,this);
 }

}
