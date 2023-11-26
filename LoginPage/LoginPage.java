package LoginPage;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame{
    private JPanel panel1;
    private JButton loginButton;
    private JButton signUpButton;
    private JTextField UserText;
    private JPasswordField passwordText;
    private JFrame frame;

    public LoginPage(){
        frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 200));
        frame.setResizable(false);
        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getSignUpButton() {
        return signUpButton;
    }

    public JTextField getUserText() {
        return UserText;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }
}
