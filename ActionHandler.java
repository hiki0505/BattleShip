package NavalBattle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ActionHandler implements MouseListener {
//    JButton button[][] = new JButton[11][11];
    JButton but;

    BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
    BufferedImage resized = resize(myPicture,20,20);
    JLabel image = new JLabel(new ImageIcon(resized));

    public ActionHandler() throws IOException {
    }
//    Dimension size = image.getPreferredSize();

//    public ActionHandler(JButton button[][], JLabel img) throws IOException {
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                button[i][j].add(img);
//            }
//        }
//    }

//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        JButton but = (JButton) actionEvent.getSource();
//        but.add(image);
////        for (int i = 0; i < 11; i++) {
////            for (int j = 0; j < 11; j++) {
////                if (actionEvent.getSource() == button[i][j]){
////                    button[i][j].add(image);
////                }
////            }
////
//    }

    private static BufferedImage resize(BufferedImage myPicture, int height, int width) {
        Image tmp = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp,0,0,null);
        g2d.dispose();
        return resized;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
          System.exit(0);
//        but = (JButton) mouseEvent.getSource();
//        but.add(image);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
