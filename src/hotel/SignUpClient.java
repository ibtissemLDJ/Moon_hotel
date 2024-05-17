package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SignUpClient extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_2;
  private JPasswordField passwordField;
  private JTextField textField_3;
  private JTextField textField_4;

  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          SignUpClient frame = new SignUpClient();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  
  public SignUpClient() {
    setTitle("Moon Hotel");
    setBackground(new Color(255, 255, 255));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(350, 160, 800, 480);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(253, 245, 230));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setResizable(false);

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
    textName.setBounds(32, 98, 220, 23);
    contentPane.add(textName);
    textName.setColumns(10);
    
    JLabel lbllastName = new JLabel("Last name");
    lbllastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lbllastName.setBounds(32, 121, 85, 35);
    contentPane.add(lbllastName);
    
    JTextField  textLastName = new JTextField();
    textLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
    textLastName.setBounds(32, 145, 220, 23);
    contentPane.add(textLastName);
    textLastName.setColumns(10);
    
    JLabel lblemail = new JLabel("Email");
    lblemail.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblemail.setBounds(32, 172, 85, 31);
    contentPane.add(lblemail);
    
    JTextField textEmail = new JTextField();
    textEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
    textEmail.setBounds(32, 195, 220, 23);
    contentPane.add(textEmail);
    textEmail.setColumns(10);
    
    JLabel lblpassword = new JLabel("Password");
    lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblpassword.setBounds(32, 312, 112, 23);
    contentPane.add(lblpassword);
    
    passwordField = new JPasswordField();
    passwordField.setEchoChar('*');


passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
    passwordField.setBounds(32, 330, 220, 23);
    contentPane.add(passwordField);
    

    JLabel lblPhoneNumber = new JLabel("Phone number");
    lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblPhoneNumber.setBounds(32, 228, 112, 13);
    contentPane.add(lblPhoneNumber);
    
    JTextField textPhonNumber = new JTextField();
    textPhonNumber.setBounds(31, 241, 221, 23);
    contentPane.add(textPhonNumber);
    textPhonNumber.setColumns(10);
    
    JLabel lblNewLabel_1 = new JLabel("Adress");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNewLabel_1.setBounds(32, 270, 100, 13);
    contentPane.add(lblNewLabel_1);
    
    JTextField textAdress = new JTextField();
    textAdress.setBounds(32, 283, 221, 23);
    contentPane.add(textAdress);
    textAdress.setColumns(10);
    
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
    	  String Adress = textAdress.getText();
    	// Crée une instance de Client et appelle signUpClient sur cette instance
          Client client = new Client(Name,  LastName, Email, Password, phoneNumber, Adress);
        try {
              client.signUpClient(User.ID, Name, LastName, Email, Password, phoneNumber, Adress);
            HomePageClient homePC= new HomePageClient ();
               homePC.show();
      } catch (AlreadyExistException ex) {
          // Gérer l'exception, par exemple afficher un message d'erreur à l'utilisateur
          ex.printStackTrace();
          LogInClient log = new LogInClient();
		    log.show();
      }
      }        
          
      });
    signup.setBounds(93, 381, 85, 21);
    contentPane.add(signup);
    
    
    
  }
}

