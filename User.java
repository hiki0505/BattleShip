package NavalBattle;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class User extends JFrame {

    Grid abovePanel = new Grid();
    ImagePanel belowPanel = new ImagePanel();
    Boat boat = new Boat();

    public User(int xPos, int yPos, int width, int height) throws IOException {
        this.setTitle("BattleShip");
        this.setSize(width,height);
        this.setLayout(new GridLayout(2,4));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().add(abovePanel);
        this.getContentPane().add(belowPanel);
        this.setBounds(xPos,yPos,width,height);
        this.setResizable(true);
        this.pack();
    }










}
