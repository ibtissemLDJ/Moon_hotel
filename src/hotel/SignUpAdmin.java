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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class SignUpAdmin extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textField_3;

  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          SignUpAdmin frame = new SignUpAdmin();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

 
  public SignUpAdmin() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(350, 160, 800, 480);
    setTitle("Moon Hotel");
    setResizable(false);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setBackground(new Color(253, 245, 230));
    

    setContentPane(contentPane);
    contentPane.setLayout(null);
    
   
    JLabel Moon = new JLabel("New label");
    Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
    Moon.setIcon(new ImageIcon(img2));
    Moon.setBounds(495, 24, 168, 63);
    contentPane.add(Moon);
    
    JLabel lblphoto = new JLabel("");
    Image img = new ImageIcon(this.getClass().getResource("Group 1 (2).png")).getImage();
    lblphoto.setIcon(new ImageIcon(img));
    lblphoto.setBounds(414, 81, 362, 310);
    contentPane.add(lblphoto);
    
    JLabel lblNewLabel_2 = new JLabel("SignUp");
    lblNewLabel_2.setForeground(new Color(153, 51, 0));
    lblNewLabel_2.setBackground(new Color(153, 51, 0));
    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblNewLabel_2.setBounds(79, 35, 85, 35);
    contentPane.add(lblNewLabel_2);
    
    JLabel lblname = new JLabel("Name");
    lblname.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblname.setBounds(32, 81, 71, 23);
    contentPane.add(lblname);
    
    JTextField textName = new JTextField();
    textName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    textName.setBounds(32, 102, 220, 23);
    contentPane.add(textName);
    textName.setColumns(10);
    
    JLabel lbllastName = new JLabel("Last name");
    lbllastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbllastName.setBounds(32, 133, 220, 23);
    contentPane.add(lbllastName);
    
    JTextField textLastName = new JTextField();
    textLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    textLastName.setBounds(32, 155, 220, 23);
    contentPane.add(textLastName);
    textLastName.setColumns(10);
    
    JLabel lblemail = new JLabel("Email");
    lblemail.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblemail.setBounds(32, 179, 220, 29);
    contentPane.add(lblemail);
    
    JTextField textEmail = new JTextField();
    textEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
    textEmail.setBounds(32, 201, 220, 23);
    contentPane.add(textEmail);
    textEmail.setColumns(10);
    
    JLabel lblpassword = new JLabel("Code Admin");
    lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblpassword.setBounds(32, 279, 220, 29);
    contentPane.add(lblpassword);
    
    JPasswordField passwordField = new JPasswordField();
    passwordField.setEchoChar('*');
    passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
    passwordField.setBounds(32, 301, 220, 23);
    contentPane.add(passwordField);
    
    JLabel lblNewLabel = new JLabel("Phone number");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNewLabel.setBounds(32, 231, 220, 23);
    contentPane.add(lblNewLabel);
    
    JTextField textPhonNumber = new JTextField();
    textPhonNumber.setBounds(32, 252, 220, 23);
    contentPane.add(textPhonNumber);
    textPhonNumber.setColumns(10);
    
    JButton signup = new JButton("Sign Up");
    signup.setBackground(new Color(153, 51, 0));


signup.setForeground(new Color(255, 255, 255));
    signup.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  String Name = textName.getText();
    	  String LastName = textLastName.getText();
    	  String Email = textEmail.getText();
    	  String Password = passwordField.getText();
    	  String phoneNumber = textPhonNumber.getText(); 
    	 
         Administrateur admin = new Administrateur( Name, LastName, Email, Password,  phoneNumber);
         try {
        	 admin.signUpAdmin(User.ID , Name, LastName, Email, Password,  phoneNumber);
        	 HomePageAdmin homePA= new HomePageAdmin();
              homePA.show();
         }catch(AlreadyExistException ex ){
        	 ex.printStackTrace();
        	 LogInAdmin login = new LogInAdmin();
 	        login.show();
         }catch(NotAdminException  ex) {
        	 
        	 ex.printStackTrace();
        	 SignUpAdmin adm = new SignUpAdmin();
        	 adm.show();
        	 JOptionPane.showMessageDialog(contentPane, "You forget your code");
         }
         
      }
    });
    signup.setBounds(96, 346, 85, 21);
    contentPane.add(signup);
    
    
  }
}

