import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;


public class Login 
//implements ActionListener
{
    
    private JFrame frame;
    private JPanel panel;
    private JButton loginbutton;
    private JLabel userLabel;
    private JLabel passLabel;
    private JPasswordField password;
    private JTextField user;

    public Login() {
        frame = new JFrame();
        panel = new JPanel(new GridLayout(3,3));
        userLabel = new JLabel("User:");
        passLabel = new JLabel("Password:");
        user = new JTextField();
        password = new JPasswordField();
        loginbutton = new JButton("Login");
      //  loginbutton = new ActionListener() 
      {
        };
    }
}
