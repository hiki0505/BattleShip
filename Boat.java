package NavalBattle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Boat {

//    public int NumberOfShips = 4;
//    public int ShipLives = 20; // 20 for example
//    some change for test
    //changes for user2


    public Boat(){ }

        private static BufferedImage resize(BufferedImage myPicture, int height, int width) {
        Image tmp = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp,0,0,null);
        g2d.dispose();
        return resized;
    }

    public ImageIcon createImage() throws IOException {
        BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
        BufferedImage resized = resize(myPicture,20,20);
        ImageIcon im=new ImageIcon(resized);
        return im;
    }

    public JLabel[] addImageIntoPanel(JPanel panel) throws IOException {
        BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
        BufferedImage[] resized = new BufferedImage[14];
        for (int i = 0; i < 14; ++i) {
            resized[i] = resize(myPicture, 20, 30);
        }
        JLabel[] img = new JLabel[14];
        for (int i = 0; i < 14; ++i) {
            img[i] = new JLabel((new ImageIcon(resized[i])));
        }
        ImageIcon imgArr[] = new ImageIcon[14];
        for (int i = 0; i < 14; i++) {
            imgArr[i] = new ImageIcon(resized[i]);
        }
        Dimension size = img[0].getPreferredSize();
        for (int i = 0; i < 14; ++i) {
            panel.add(img[i]);
            img[i].setBounds(7 + i * 50, 7, size.width, size.height);
        }
        return img;
    }


}

