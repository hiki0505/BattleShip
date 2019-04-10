package NavalBattle;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Boat boat = new Boat();
        BattleShip battleShip = new BattleShip();
        JButton buttons_for_set[][] = new JButton[11][11];
        JButton buttons_for_attack[][] = new JButton[11][11];
        JFrame User1 = battleShip.User(buttons_for_set,500,500,61,80);
        JFrame User2 = battleShip.User(buttons_for_set,500,500,761,80);
        JFrame attackframe1 = battleShip.AttackFrame(buttons_for_attack,61,280,500,500);
        JFrame attackframe2 = battleShip.AttackFrame(buttons_for_attack,761,280,500,500);

//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 11; j++) {
//                buttons_for_attack[i][j].setIcon(boat.createImage());
//            }
//        }


//        User1.setSize(500,500);
//        User2.setSize(500,500);
//        User1.setBounds(61,80,500,500);
//        User2.setBounds(561,60,500,500);
    }

}
