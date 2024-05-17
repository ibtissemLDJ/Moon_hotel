package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class LogInAdmin extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;

  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          LogInAdmin frame = new LogInAdmin();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

 
  public LogInAdmin() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(350, 160, 800, 480);
    setTitle("Moon Hotel");
    setResizable(false);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setBackground(new Color(253, 245, 230));
    Border border = BorderFactory.createLineBorder(new Color(153, 51, 0), 3);
    contentPane.setBorder(border);
    
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Welcom Back Dear!");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblNewLabel.setBounds(28, 47, 186, 20);
    contentPane.add(lblNewLabel);
    
    JLabel lbllogin = new JLabel("Log in");
    lbllogin.setForeground(new Color(139, 69, 19));
    lbllogin.setFont(new Font("Tahoma", Font.BOLD, 16));
    lbllogin.setBounds(38, 77, 95, 20);
    contentPane.add(lbllogin);
    
    JLabel email= new JLabel("Email");
    email.setFont(new Font("Tahoma", Font.PLAIN, 14));
    email.setBounds(36, 130, 78, 13);
    contentPane.add(email);
    
    JTextField textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
    textField.setBounds(35, 144, 201, 25);
    contentPane.add(textField);
    textField.setColumns(10);
    
    JLabel password = new JLabel("Code Admin");
    password.setFont(new Font("Tahoma", Font.PLAIN, 14));
    password.setBounds(38, 173, 126, 20);
    contentPane.add(password);
    
    JPasswordField passwordField = new JPasswordField();
    passwordField.setEchoChar('*');
    passwordField.setBounds(38, 192, 198, 25);
    contentPane.add(passwordField);
    
    JLabel Moon = new JLabel("");
    Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
    Moon.setIcon(new ImageIcon(img2));
    Moon.setBounds(495, 24, 168, 63);
    contentPane.add(Moon);
    
    JLabel lblphoto = new JLabel("");
    Image img = new ImageIcon(this.getClass().getResource("Group 1 (2).png")).getImage();
    lblphoto.setIcon(new ImageIcon(img));
    lblphoto.setBounds(414, 81, 362, 310);
    
    contentPane.add(lblphoto);
    
    JButton login = new JButton("Log in");
    login.setBackground(new Color(153, 51, 0));
    login.setFont(new Font("Tahoma", Font.PLAIN, 16));
    login.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  String email = textField.getText();
          String password = new String(passwordField.getPassword());
          try {
          Administrateur admin = new Administrateur("","","",email , password);
          
           admin.signInAdmin(email, password);
           
        HomePageAdmin homePC= new HomePageAdmin ();
        homePC.show();
      }catch(ForgetPasswordException  ex) {
    	  ex.printStackTrace();
    	  LogInAdmin login = new LogInAdmin();
	        login.show();
	        JOptionPane.showMessageDialog(contentPane, "You forgot your password!");
      }catch(DoesntExistException ex) {
    	  ex.printStackTrace();
    	  LogInAdmin login = new LogInAdmin();
	        login.show();
	        JOptionPane.showMessageDialog(contentPane, "You wrong!!");
      }
      }
    });
    login.setBounds(201, 250, 104, 27);
    contentPane.add(login);
    
    JCheckBox rememberMe = new JCheckBox("remember me");
    rememberMe.setFont(new Font("Tahoma", Font.PLAIN, 12));
    rememberMe.setBounds(38, 234, 126, 21);
    contentPane.add(rememberMe);
  }

}