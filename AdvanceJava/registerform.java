import javax.swing.*;
public class registerform{
    public registerform(){
        JFrame f = new JFrame("Register");
        JLabel name = new JLabel("Name");
        name.setBounds(20,20,150,25);
        f.add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(180,20,150,25);
        f.add(tfname);

        
        JLabel lemail = new JLabel("E-mail");
        lemail.setBounds(20,55,150,25);
        f.add(lemail);

        
        JTextField tfemail = new JTextField();
        tfemail.setBounds(180,50,150,25);
        f.add(tfemail);

        
        JLabel laddress = new JLabel("Address");
        laddress.setBounds(20,90,150,25);
        f.add(laddress);

        
        JTextField tfaddress = new JTextField();
        tfaddress.setBounds(180,80,150,25);
        f.add(tfaddress);

        
        JButton save = new JButton("Save");
        save.setBounds(180,120,150,25);
        f.add(save);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new registerform();
    }
}