package Q1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEventHandler implements ActionListener {

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbt = (JButton)e.getSource();
        //e.getWhen();
        // me - child type
        // e - parent type
        // me cast in to the e type
        MyActionEvent me = (MyActionEvent) e;
        // me.getWhen(); check how to write your own action event class
        // me.getSource();
        System.out.println(jbt.getText());
    }
}
