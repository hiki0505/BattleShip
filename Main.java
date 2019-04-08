package NavalBattle;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BattleShip battleShip = new BattleShip();
        JFrame User1 = battleShip.User(500,500,61,80);
        JFrame User2 = battleShip.User(500,500,761,80);
        JFrame attackframe1 = battleShip.AttackFrame(61,280,500,500);
        JFrame attackframe2 = battleShip.AttackFrame(761,280,500,500);

//        User1.setSize(500,500);
//        User2.setSize(500,500);
//        User1.setBounds(61,80,500,500);
//        User2.setBounds(561,60,500,500);
    }

}
