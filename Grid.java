package NavalBattle;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Grid extends JPanel {


    public Grid() throws IOException {
        this.setSize(300, 450);
        this.setLayout(new GridLayout(11,11));
    }

    public void addButtonsIntoPanel(JPanel panel, JButton button[][]){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                button[i][j] = new JButton();
                panel.add(button[i][j]);
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
    }



}
