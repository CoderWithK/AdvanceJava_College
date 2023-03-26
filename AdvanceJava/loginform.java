import javax.swing.*;
import java.awt.event.*;

public class loginform implements ActionListener{
    JTextField tfuser,tfPassword;
    JButton Login = new JButton("Login");
    JFrame f = new JFrame("Login");

    public loginform()
    {
        // JFrame f = new JFrame("Login");
        JLabel luser = new JLabel("Username");
        luser.setBounds(20, 20, 150, 25);
        f.add(luser);

        tfuser = new JTextField();
        tfuser.setBounds(180, 20, 150, 25);
        f.add(tfuser);
        
        JLabel lPasssword = new JLabel("Password");
        lPasssword.setBounds(20, 55, 150, 25);
        f.add(lPasssword);
        
        tfPassword = new JTextField();
        tfPassword.setBounds(180, 50, 150, 25);
        f.add(tfPassword);

        // JButton Login = new JButton("Login");
        Login.setBounds(180, 90, 150, 25);
        Login.addActionListener(this);
        f.add(Login);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
    public static void main(String[] args) {
        new loginform();
    }
    public void actionPerformed(ActionEvent e){
        String getusername = tfuser.getText();
        String getpassword = tfPassword.getText();

        if(getusername.equals("admin") && getpassword.equals("admin")){
            JDialog d = new JDialog(f,"loginsuccess",true);
            

        }
        
        // if(getusername.equals("admin") && getpassword.equals("admin"))
        // {
        //     System.out.println("Login Successfull !!");
        // }
        // else{
        //     System.out.println("Login Un-successfull !!");
        // }
    }
}
