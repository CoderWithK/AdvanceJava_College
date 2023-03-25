// Ashish
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Catchme implements MouseListener {
    int x;
    int y;
    JButton jb;
    JLabel label;



    public Catchme(){
        JFrame f = new JFrame("Catch The Button If you Can");

         jb = new JButton("Catch For Prize");


        jb.setBounds(100,100,150,30);


        jb.addMouseListener( this);

        f.add(jb);


        label = new JLabel("Total Count = 0");
        label.setBounds(250,400,150,30);
        f.add(label);



        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);



    }
    public static void main(String[] args) {
        new Catchme();
    }

    int counter;
    @Override
    public void mouseClicked(MouseEvent e) {
        counter+= 1;
        label.setText("Total Count :"+ counter );



    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        Random random = new Random();
        x = random.nextInt(400);
        y = random.nextInt(400);

        jb.setBounds(x,y,150,30);



    }
    @Override
    public void mouseExited(MouseEvent e) {


    }


}