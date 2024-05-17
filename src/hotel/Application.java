package hotel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


		import java.awt.BorderLayout;
		import java.awt.EventQueue;

		import javax.swing.JFrame;
		import javax.swing.JPanel;
		import javax.swing.border.Border;
		import javax.swing.border.EmptyBorder;
		import javax.swing.JLabel;
		import java.awt.Color;
		import javax.swing.SwingConstants;
		import java.awt.Font;
		import java.awt.Image;

		import javax.swing.BorderFactory;
		import javax.swing.ImageIcon;
		import javax.swing.JButton;
		import javax.swing.JComponent;
		import javax.swing.UIManager;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;

		public class Application extends JFrame {
			public Application() {
				setTitle("Moon Hotel");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(350, 160, 800, 480);
				getContentPane().setBackground(new Color(253, 245, 230));
				getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
				getContentPane().setLayout(null);
				
				
				JLabel lblWelcome = new JLabel(" Welcom To");
				lblWelcome.setBounds(31, 101, 145, 20);
				lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
				getContentPane().add(lblWelcome);
				
				JLabel lblMoon = new JLabel(" Moon Hotel");
				lblMoon.setBounds(31, 131, 145, 22);
				lblMoon.setFont(new Font("Tahoma", Font.BOLD, 20));
				getContentPane().add(lblMoon);
				
				JLabel lblLigne1 = new JLabel("\"Moon Hotel\" is a luxurious oasis nestled amidst");
				lblLigne1.setBounds(31, 183, 357, 20);
				lblLigne1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				getContentPane().add(lblLigne1);
				
				JLabel lblLigne2 = new JLabel("picturesque landscapes, offering a harmonious blend ");
				lblLigne2.setBounds(31, 198, 404, 20);
				lblLigne2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				getContentPane().add(lblLigne2);
				
				JLabel lblLigne3 = new JLabel("of modern elegance and timeless charm. Situated");
				lblLigne3.setBounds(31, 213, 426, 28);
				lblLigne3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				getContentPane().add(lblLigne3);
				
				JLabel lblLigne4 = new JLabel("in an idyllic lakes, the hotel embodies a sense of ");
				lblLigne4.setBounds(31, 239, 376, 13);
				lblLigne4.setFont(new Font("Tahoma", Font.PLAIN, 16));
				getContentPane().add(lblLigne4);
				
				JLabel lblLigne5 = new JLabel("tranquility and serenity.");
				lblLigne5.setBounds(31, 258, 226, 13);
				lblLigne5.setFont(new Font("Tahoma", Font.PLAIN, 16));
				getContentPane().add(lblLigne5);
				
				JButton buttonVisitSite = new JButton("Visit Our Site ");
				buttonVisitSite.setBounds(31, 303, 132, 36);
				buttonVisitSite.setForeground(new Color(255, 255, 255));
				buttonVisitSite.setFont(new Font("Tahoma", Font.PLAIN, 14));
				buttonVisitSite.setBackground(new Color(153, 51, 0));
				getContentPane().add(buttonVisitSite);
				
				JButton buttonAdmin = new JButton("Administrator");
				buttonAdmin.setBackground(new Color(153, 51, 0)); 
				buttonAdmin.setForeground(new Color(245, 245, 220));
				buttonAdmin.setBounds(635, 12, 128, 21);
				buttonAdmin.setFont(new Font("Tahoma", Font.PLAIN, 14));
				buttonAdmin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						IfAdmin adm = new IfAdmin();
						adm.show();
					}
				});
				getContentPane().add(buttonAdmin);
				
				JLabel lblImage = new JLabel("");
				lblImage.setBounds(420, 31, 376, 423);
				Image img = new ImageIcon(this.getClass().getResource("Frame 3 (10).png")).getImage();
				lblImage.setIcon(new ImageIcon(img));
				getContentPane().add(lblImage);
				
				JLabel Moon = new JLabel("New label");
				Moon.setBounds(0, 10, 169, 69);
				Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
				Moon.setIcon(new ImageIcon(img2));
				getContentPane().add(Moon);
				
				JButton buttonClient = new JButton("Client");
				buttonClient.setBackground(new Color(153, 51, 0)); 
				buttonClient.setForeground(new Color(245, 245, 220));
				buttonClient.setBounds(516, 12, 109, 21);
				buttonClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
				buttonClient.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						IfClient cli = new IfClient();
						cli.show();
					}
				});
				getContentPane().add(buttonClient);
				 setResizable(false);
			}

			private static final long serialVersionUID = 1L;
			private JPanel contentPane;

			/**
			 * Launch the application.
			 */
			
			
			
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Application frame = new Application();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		}
