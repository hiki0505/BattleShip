package NavalBattle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ActionHandler implements ActionListener {
    static int counter=0;
    Boat boat = new Boat();
    ImageIcon image = boat.createImage();
    int c = 0;
    static int flag = 0;

//    public void setFlag(int flag){
//        ActionHandler.flag = flag;
//    }

    public ActionHandler() throws IOException { }

//    public static void detectClick(){
//            if ()
//    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
//        BattleShip battleShip = new BattleShip();
        JButton but = (JButton) actionEvent.getSource();
        if(c % 2 == 0){
            if(counter++<30) {
                but.setIcon(image);
                but.setActionCommand("Setted");
//                if (but.getActionCommand().equals("Setted")){
//                    System.out.println("Setted "+ counter);
//                }
            }
        }else {
            but.setIcon(null);
        }
        c++;


//        System.out.println(flag);

//        if(counter == 30){
//            try {
//                JFrame attackframe1 = battleShip.AttackFrame(61,280,500,500);
//                JFrame attackframe2 = battleShip.AttackFrame(761,280,500,500);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }



}
