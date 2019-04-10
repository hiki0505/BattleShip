package NavalBattle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;


public class BattleShip  {

//    public BattleShip(){
//
//    }

//    private static int flag = 0;

    public JFrame User(JButton button_set[][],int width, int height, int xPos, int yPos) throws IOException {
        JFrame frame = new JFrame();
        Grid abovePanel = new Grid();
        ImagePanel belowPanel = new ImagePanel();
        Boat boat = new Boat();
        JLabel img[] = boat.addImageIntoPanel(belowPanel);
//        JPanel panelLeft = new JPanel();
//        JPanel panelRight = new JPanel();
//        JLabel text = new JLabel();
//        text.setText("MENU");
//        panelLeft.setSize(500, 650);
//        panelRight.setSize(200,650);
//        panelRight.setBorder(BorderFactory.createLineBorder(Color.RED, 7));
//        panelRight.setBackground(Color.WHITE);
////        panelLeft.setLayout(new GridLayout(11,11));
//        panelRight.setLayout(null);
//        panelRight.add(text, BorderLayout.EAST);

//        BufferedImage myPicture = ImageIO.read(new File("/home/hikmet/Desktop/595a7960d639a15d096a226d.png"));
//        BufferedImage[] resized = new BufferedImage[14];
//
//        for (int i = 0; i < 14; ++i) {
//            resized[i] = resize(myPicture, 20, 30);
//        }
//        JLabel[] img = new JLabel[14];
//        for (int i = 0; i < 14; ++i) {
//            img[i] = new JLabel((new ImageIcon(resized[i])));
//        }
//
//        ImageIcon imgArr[] = new ImageIcon[14];
//        for (int i = 0; i < 14; i++) {
//            imgArr[i] = new ImageIcon(resized[i]);
//        }
//
//        Dimension size = img[0].getPreferredSize();
//
//        for (int i = 0; i < 14; ++i) {
//            belowPanel.add(img[i]);
//            img[i].setBounds(7 + i * 50, 7, size.width, size.height);
//        }
        button_set = new JButton[11][11];
        abovePanel.addButtonsIntoPanel(abovePanel, button_set);

//        for (int i = 0; i < 14; i++) {
//            new MouseHandler(img[i]);
//        }
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    button_set[i][j].addActionListener(new ActionHandler());
//                    flag++;
//                    System.out.println(flag);
                }
            }

//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                if (button_set[i][j].getActionCommand().equals("Setted")){
//                    System.out.println("("+i+","+j+")");
//                }
//
//            }
//        }



       /* */

        frame.setTitle("BattleShip");
        frame.setSize(width,height);
        frame.setLayout(new GridLayout(2,4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().add(abovePanel);
        frame.getContentPane().add(belowPanel);
        frame.setBounds(xPos,yPos,width,height);
        frame.setResizable(true);
        frame.pack();
        return frame;
    }

    public JFrame AttackFrame(JButton button_attack[][],int xPos, int yPos, int width, int height) throws IOException {
        JFrame attackframe = new JFrame();
        button_attack = new JButton[11][11];
        Grid attackpanel = new Grid();
        attackpanel.addButtonsIntoPanel(attackpanel, button_attack);
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                button_attack[i][j].addActionListener(actionEvent -> {
////                    ActionHandler.detectClick(button_attack);
//                });
//            }
//        }
        attackframe.setTitle("Frame for attacking");
        attackframe.setSize(width,height);
        attackframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        attackframe.setVisible(true);
        attackframe.getContentPane().add(attackpanel);
        attackframe.setBounds(xPos,yPos,width,height);
        attackframe.setResizable(true);
        attackframe.pack();
        return attackframe;
    }

//    public void match(){
//
//    }

//    public void shoot(JFrame frame, JButton button){
//        button.addActionListener((c) -> {
//            match();
//        });



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