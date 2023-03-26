import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class changecolor implements ActionListener{
    /* For event handling in java, first of all we should implement respective listener interface as there are
     different interfaces for different events.*/

    JFrame f = new JFrame("Change Color");
    // Here, JFrame is made class variable similar to global variable.

        public changecolor()
        {
            JButton b = new JButton("Click Me");
            b.setBounds(180,120,150,25);
            b.addActionListener(this);
            // Here, we register the listener interface to the event source which is button here.
            f.add(b);
            
            f.setSize(500,500);
            f.setLayout(null);
            f.setVisible(true);
            f.setResizable(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().setBackground(Color.BLUE);

        }
        public static void main(String[] args) {
            new changecolor();
        }
        Random random = new Random();
        int count;

        // Now we write the event handling code by implementing the respective method provided by ActionListener interface.
        public void actionPerformed(ActionEvent event){
            // f.getContentPane().setBackground(Color.CYAN);
            count = random.nextInt(5);
            System.out.println(count);
            switch (count) {
                case 0:
                f.getContentPane().setBackground(Color.BLACK);
                    break;
                case 1:
                f.getContentPane().setBackground(Color.green);
                    break;
                case 2:
                    f.getContentPane().setBackground(Color.cyan);
                    break;
                case 3:
                f.getContentPane().setBackground(Color.yellow);
                    break;
                case 4:
                f.getContentPane().setBackground(Color.red);
                    break;
            }
        }
    }

