package NavalBattle;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class BattleShip extends JFrame {

    BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
    BufferedImage resized = resize(myPicture,20,20);
    JLabel image = new JLabel(new ImageIcon(resized));

//    Image g=new Image(resized);
    ImageIcon im=new ImageIcon(resized);

    JButton button[][] = new JButton[11][11];

    public BattleShip() throws IOException {
//        ActionHandler actionHandler = new ActionHandler();
//        MouseHandler movement = new MouseHandler()
        this.setResizable(false);
        this.pack();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JLabel text = new JLabel();
        text.setText("MENU");
        panelLeft.setSize(500, 650);
        panelRight.setSize(200,650);
        panelRight.setBorder(BorderFactory.createLineBorder(Color.RED, 7));
        panelRight.setBackground(Color.WHITE);
        panelLeft.setLayout(new GridLayout(11,11));
        panelRight.setLayout(null);
        panelRight.add(text, BorderLayout.EAST);

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
            panelRight.add(img[i]);
            img[i].setBounds(7 + i * 50, 7, size.width, size.height);
        }


//        JButton button[][] = new JButton[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                button[i][j] = new JButton();
                panelLeft.add(button[i][j]);
            }
        }


        button[1][0].setText("A"); button[0][1].setText("1");
        button[2][0].setText("B"); button[0][2].setText("2");
        button[3][0].setText("C"); button[0][3].setText("3");
        button[4][0].setText("D"); button[0][4].setText("4");
        button[5][0].setText("E"); button[0][5].setText("5");
        button[6][0].setText("F"); button[0][6].setText("6");
        button[7][0].setText("G"); button[0][7].setText("7");
        button[8][0].setText("H"); button[0][8].setText("8");
        button[9][0].setText("I"); button[0][9].setText("9");
        button[10][0].setText("J"); button[0][10].setText("10");

//        Point p = panelRight.getLocation();
//        System.out.println(button[4][3].getLocation());
//        int button_X_Pos = button[2][5].getLocationOnScreen().x;
//        int button_Y_Pos = button[2][5].getLocationOnScreen().y;
//        System.out.println("("+ button_X_Pos + ","+ button_Y_Pos + ")");

//        button[2][5].add(image);

        for (int i = 0; i < 14; i++) {
            new MouseHandler(img[i]);
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                button[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        JButton b = (JButton) actionEvent.getSource();
                        b.setIcon(im);
//                       JPanel pano = (JPanel) actionEvent.getSource();
//                       pano = panelRight;
//                       panelRight.remove();
                    }
                });
//                    panelRight.remove(img[5]);
            }
        }

//        addButtonsToPanel(panelLeft);
//        addImageToPanel(panelRight);

//        BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
//        BufferedImage resized = resize(myPicture, 20, 30);
//        JLabel img = new JLabel(new ImageIcon(resized));
//        button[1][3].add(img);



        this.setTitle("BattleShip");
        this.setSize(700,700);
        this.setLayout(new GridLayout(2,4));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().add(panelLeft);
        this.getContentPane().add(panelRight);
    }

    private static BufferedImage resize(BufferedImage myPicture, int height, int width) {
        Image tmp = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp,0,0,null);
        g2d.dispose();
        return resized;
    }


//    private static void addImageToPanel(JPanel panRight) throws IOException {
//        BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
//        BufferedImage[] resized = new BufferedImage[14];
//        for (int i = 0; i < 14; ++i) {
//            resized[i] = resize(myPicture, 20, 30);
//        }
//        JLabel[] img = new JLabel[14];
//        for (int i = 0; i < 14; ++i) {
//            img[i] = new JLabel((new ImageIcon(resized[i])));
//        }
//        Dimension size = img[0].getPreferredSize();
//
//        for (int i = 0; i < 14; ++i) {
//            panRight.add(img[i]);
//            img[i].setBounds(7 + i * 50, 7, size.width, size.height);
//        }
//
//    }

//    private static void addButtonsToPanel(JPanel panLeft){
//        JButton button[][] = new JButton[11][11];
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                button[i][j] = new JButton();
//                panLeft.add(button[i][j]);
//            }
//        }
//
//
//        button[1][0].setText("A"); button[0][1].setText("1");
//        button[2][0].setText("B"); button[0][2].setText("2");
//        button[3][0].setText("C"); button[0][3].setText("3");
//        button[4][0].setText("D"); button[0][4].setText("4");
//        button[5][0].setText("E"); button[0][5].setText("5");
//        button[6][0].setText("F"); button[0][6].setText("6");
//        button[7][0].setText("G"); button[0][7].setText("7");
//        button[8][0].setText("H"); button[0][8].setText("8");
//        button[9][0].setText("I"); button[0][9].setText("9");
//        button[10][0].setText("J"); button[0][10].setText("10");
//    }
}



//        button[1][3].setIcon(imageIcon);
//        this.pack();
//        JButton but = new JButton("AAA");
//        this.add(panel, BorderLayout.EAST);
//        this.add(new Button("Let's go"));
//        BufferedImage[] resized = new BufferedImage[14];
//        for (int i = 0; i < 14; ++i) {
//            resized[i] = resize(myPicture, 30, 40);
//        }
//
//        JLabel[] img = new JLabel[14];
//        for (int i = 0; i < 14; ++i) {
//            img[i] = new JLabel((new ImageIcon(resized[i])));
//        }
//
//        Dimension size = img[0].getPreferredSize();

//        panelRight.add(img);
//        img.setBounds(50,50,size.width, size.height);
//        panelRight.add(img2);
//        img2.setBounds(100,100,size.width,size.height);
//        panelRight.add(img3);
//        img3.setBounds(150, 150,size.width, size.height);
//        for (int i = 0; i < 14; ++i) {
//            panelRight.add(img[i]);
//            img[i].setBounds(7 + i * 50, 7, size.width, size.height);
//        }
//        BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));

//        BufferedImage resized = resize(myPicture, 50, 50);
//        BufferedImage resized2 = resize(myPicture, 50, 50);
//        BufferedImage resized3 = resize(myPicture, 50, 50);
//        ImageIcon imageIcon = new ImageIcon("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"); // load the image to a imageIcon
//        Image image = imageIcon.getImage(); // transform it
//        Image newimg = image.getScaledInstance(30, 30,  Image.SCALE_AREA_AVERAGING); // scale it the smooth way
//        imageIcon = new ImageIcon(newimg);
//        JLabel img = new JLabel(new ImageIcon(resized));
//        JLabel img2 = new JLabel(new ImageIcon(resized2));
//        JLabel img3 = new JLabel(new ImageIcon(resized3));
//        Dimension size = img.getPreferredSize();
//        Dimension size2 = img2.getPreferredSize();
//        Dimension size3 = img3.getPreferredSize();
//        img.setBorder(new EmptyBorder());
//        img.setPreferredSize(new Dimension(50,50));
//        panelRight.add(text);
//        panel.setLayout(new GridLayout(1, 10));