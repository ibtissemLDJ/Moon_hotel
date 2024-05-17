package hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IfClient extends JFrame {
	  private static final long serialVersionUID = 1L;
	  private JPanel contentPane;

	  
	  public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	      public void run() {
	        try {
	          IfClient frame = new IfClient();
	          frame.setVisible(true);
	        } catch (Exception e) {
	          e.printStackTrace();
	        }
	      }
	    });
	  }

	  
	  public IfClient() {
	    setTitle("Moon Hotel");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(350, 160, 800, 480);
	    contentPane = new JPanel();
	    contentPane.setBackground(new Color(253, 245, 230));
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    

	    setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    JLabel Moon = new JLabel("New label");
	    Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
	    Moon.setIcon(new ImageIcon(img2));
	    Moon.setBounds(284, 57, 159, 61);
	    contentPane.add(Moon);
	    
	    JLabel lblNewLabel_1 = new JLabel("Welcome Client, Do You Have Account ?");
	    lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
	    lblNewLabel_1.setBounds(213, 128, 351, 44);
	    contentPane.add(lblNewLabel_1);
	    
	    JButton signup = new JButton("Sign up");
	    signup.setForeground(new Color(255, 255, 255));
	    signup.setBackground(new Color(153, 51, 0));
	    signup.setFont(new Font("Script MT Bold", Font.BOLD, 16));
	    signup.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        SignUpClient sign = new SignUpClient();
	        sign.show();
	      }
	    });
	    signup.setBounds(201, 213, 105, 29);
	    contentPane.add(signup);
	    
	    JButton login = new JButton("Log in");
	    login.setBackground(new Color(153, 51, 0));
	    login.setForeground(new Color(255, 255, 255));
	    login.setFont(new Font("Script MT Bold", Font.BOLD, 16));
	    login.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        LogInClient login = new LogInClient ();
	        login.show();
	      }
	    });
	    login.setBounds(447, 213, 105, 29);
	    contentPane.add(login);
	  }
}
