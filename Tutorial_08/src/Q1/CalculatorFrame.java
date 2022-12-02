package Q1;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame(){
        // Panel p1 for the numbers

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3,10,10));
        p1.setBackground(Color.BLUE);
        Font myFont = new Font("SansSerif", Font.BOLD, 12);
        p1.setFont(myFont);


        // use a for loop
        JButton jbt1 = new JButton("1");
        jbt1.setBackground(Color.RED);
        MyEventHandler listener = new MyEventHandler();
        // add the action handler
        jbt1.addActionListener(listener);

        JButton jbt2 = new JButton("2");
        jbt2.setBackground(Color.RED);
        //MyEventHandler listener1 = new MyEventHandler();
        //jbt2.addActionListener(listener1);

        JButton jbt3 = new JButton("3");
        jbt3.setBackground(Color.RED);
        JButton jbt4 = new JButton("4");
        jbt4.setBackground(Color.RED);
        JButton jbt5 = new JButton("5");
        jbt5.setBackground(Color.RED);
        JButton jbt6 = new JButton("6");
        jbt6.setBackground(Color.RED);
        JButton jbt7 = new JButton("7");
        jbt7.setBackground(Color.RED);
        JButton jbt8 = new JButton("8");
        jbt8.setBackground(Color.RED);
        JButton jbt9 = new JButton("9");
        jbt9.setBackground(Color.RED);
        JButton jbt10 = new JButton("0");
        jbt10.setBackground(Color.RED);
        JButton jbt11 = new JButton(".");
        jbt11.setBackground(Color.RED);

        p1.add(jbt1);
        p1.add(jbt2);
        p1.add(jbt3);
        p1.add(jbt4);
        p1.add(jbt5);
        p1.add(jbt6);
        p1.add(jbt7);
        p1.add(jbt8);
        p1.add(jbt9);
        p1.add(jbt10);
        p1.add(jbt11);


        // Panel p2 for the operations
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1,10,10));
        p2.setBackground(Color.BLUE);
        Font myFont1 = new Font("SansSerif", Font.BOLD, 12);
        p2.setFont(myFont1);

        JButton b1 = new JButton("+");
        b1.setBackground(Color.GREEN);
        JButton b2 = new JButton("-");
        b2.setBackground(Color.GREEN);
        JButton b3 = new JButton("CLEAR");


        b3.setBackground(Color.GREEN);
        JButton b4 = new JButton("=");
        b4.setBackground(Color.GREEN);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        // Panel p3 is the combination of p1 and p2
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2,5,5));
        p3.add(p1);
        p3.add(p2);
        p3.setBackground(Color.BLUE);
        Font myFont3 = new Font("SansSerif", Font.BOLD, 12);
        p3.setFont(myFont3);

        add(p3,BorderLayout.CENTER);

        //panel p4 to add the Text field
        JTextField p4 = new JTextField();
        p4.setBounds(0,0,0,0);
        p4.setEditable(false);
        p4.setOpaque(true);
        p4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p4.setBackground(Color.YELLOW);
        add(p4, BorderLayout.NORTH);
        Font myFont4 = new Font("SansSerif", Font.BOLD, 12);
        p4.setFont(myFont4);



    }
    public static void main(String[] args) {
    // TODO code application logic here
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setTitle("My Calculator");
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
