package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class LogInClient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInClient frame = new LogInClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogInClient() {
		setTitle("Moon Hotel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(350, 160, 800, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel lblMsg = new JLabel("Welcom Back Dear!");
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMsg.setBounds(28, 47, 186, 20);
		contentPane.add(lblMsg);
		
		JLabel lblLogin = new JLabel("Log in");
		lblLogin.setForeground(new Color(139, 69, 19));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLogin.setBounds(28, 77, 95, 20);
		contentPane.add(lblLogin);
		
		JLabel lblEmail= new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(28, 123, 78, 13);
		contentPane.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldEmail.setBounds(28, 138, 201, 25);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(28, 174, 76, 20);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(28, 192, 198, 25);
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
		
		JButton buttonLogin = new JButton("Log in");
		buttonLogin.setBackground(new Color(153, 51, 0));
		buttonLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonLogin.setBounds(195, 258, 104, 27);
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = new String (textFieldEmail.getText());
			     String password = new String(passwordField.getPassword());
			     
			     try {
			         // Créer une instance de Client
			         //Client client = new Client("","", "", email, password, "");
			         // Appeler la méthode signInClient
			        Client.signInClient(email, password);
			       HomePageClient homClient = new HomePageClient();
			          homClient.show();
			  
			         
			     } catch (ForgetPasswordException  ex) {
			         ex.printStackTrace(); // Gérer l'exception selon vos besoins
			         LogInClient log=new LogInClient();
			         log.show();
			         JOptionPane.showMessageDialog(contentPane, "You forgot your password!");
			     }catch(DoesntExistException ex) {
			   		  ex.printStackTrace();
			   		  
				  LogInClient login = new LogInClient();
			       login.show();
			       JOptionPane.showMessageDialog(contentPane, "You wrong!!");
			     } 
			 }
			
			
		});
		contentPane.add(buttonLogin);
		
		
		JCheckBox rememberMe = new JCheckBox("remember me");
		rememberMe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rememberMe.setBounds(28, 235, 126, 21);
		contentPane.add(rememberMe);
	}
}
